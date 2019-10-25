package com.rotnocse.curehealth;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.rotnocse.curehealth.doctor.DoctorForm;
import com.rotnocse.curehealth.doctor.NeedDoctor;

public class DoctorActivity extends AppCompatActivity {

    public static FirebaseDatabase database;

    Button buttonDoctor;
    Button needDoctor;

    public static String doctorId="no";
    SharedPreferences sharedPreferences;

    private final int MY_PERMISSIONS_REQUEST_READ_CONTACTS=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor);

        // Connecting to the database
        database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("doctors");

        /**
         * Wiring up every thing
         */

        needDoctor = (Button) findViewById(R.id.btn_need_doctor);
        needDoctor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DoctorActivity.this, NeedDoctor.class));
            }
        });


        buttonDoctor = (Button) findViewById(R.id.btn_doctor_profile);
        if(doctorId.toString().equals("no")){
            buttonDoctor.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(DoctorActivity.this, DoctorForm.class));
                }
            });
        } else {

        }

        /**
         * Initializing variable
         */
        try{
            doctorId = sharedPreferences.getString("id","no");

        } catch (Exception e){
            e.printStackTrace();
        }


    }

    protected void onStart() {
        super.onStart();
    }

    protected void onStop() {
        super.onStop();
    }

}
