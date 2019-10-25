package com.rotnocse.curehealth.donor;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.rotnocse.curehealth.R;

import java.util.ArrayList;

import static com.rotnocse.curehealth.DonorActivity.database;

public class DonorProfile extends AppCompatActivity {

    ArrayList<Donor> dataModels;
    ListView listView;
    private static DonorAdapter adapter;
    String city;
    String group;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donor_profile);
        Bundle extras = getIntent().getExtras();
        city = extras.getString("city");
        group = extras.getString("group");
        listView = (ListView) findViewById(R.id.list_donor);
        dataModels= new ArrayList<>();

        adapter= new DonorAdapter(dataModels,getApplicationContext());

        listView.setAdapter(adapter);
        DatabaseReference myRef = database.getReference("donors");
        myRef.child(city).child(group).addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                Donor donor = dataSnapshot.getValue(Donor.class);
                dataModels.add(donor);
                adapter.notifyDataSetChanged();
                /*donorInfo.add(donor);
                String donorInfo = donor.name + "\n     " + donor.contuctNumber;
                donorList.add(donorInfo);
                arrayAdapter.notifyDataSetChanged();*/
            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(Intent.ACTION_DIAL);
                String temp = "tel:" + dataModels.get(position).getContuctNumber();
                intent.setData(Uri.parse(temp));

                startActivity(intent);
            }
        });

    }
}
