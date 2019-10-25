package com.rotnocse.curehealth.doctor;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Spinner;

import com.google.firebase.database.DatabaseReference;
import com.rotnocse.curehealth.R;

import static com.rotnocse.curehealth.DoctorActivity.database;


public class DoctorForm extends AppCompatActivity {

    Spinner cityChoice;
    Spinner groupChoice;

    EditText Name;
    EditText Mobile;
    EditText Hospital;

    Button Save;

    ProgressBar progressBar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_form);

        cityChoice = (Spinner) findViewById(R.id.dropdownCity);

        String[] citis = new String[]{"Barisal","Chittagong", "Dhaka", "Mymensingh","Khulna", "Rajshahi", "Rangpur", "Sylhet"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, citis);
        cityChoice.setAdapter(adapter);


        groupChoice = (Spinner) findViewById(R.id.especialitySP);
        String[] group = new String[]{"Acupuncture","Addition Psychiatrist", "Allergy and Asthma", "Anaesthesiology","Anatomy", "Biochemistry", "Cancer Specialist", "Cardiac Surgery",
                "Cardiology", "Chest Diseases", "Child (Paediatric)", "Clinical Hematology", "Clinical Psychology", "Dental", "Diabetology", "Embryologist", "Family Practice",
                "Dermatology", "General Physician", "General Surgery", "Gynaelogy", "Haematology", "Head and Neck Surgery","Hepatology", "Herbal", "Homoeopathic", "Infectious Disease", "Junior Consultant",
                "Laboratory Services", "Medical Microbiology", "Medicine", "Nephrology (Kidney)", "Neurology", "Neuromedicine", "Neurosurgery", "Nuclear Medicine and Ultrasound", "Occupational Therapist",
                "Oncology (Cancer/Tumour)", "Ophthalmology ( Eye )", "Oral and Maxillofacial Surgery", "Orthopaedic Surgery", "Orthopaedics", "Paediatric Hematology", "Paediatric Neurology", "Paediatric Oncology",
                "Paediatric Surgery", "Pathology", "Pediatric Gastroenterology", "Pediatric Neonatology", "Pediatric Neurosurgury", "Pharmacology", "Physical Medicine", "Piles (Colon and Rectal Surgery)", "Plastic Surgery",
                "Psychiatrist", "Pulmonology", "Radiology (X-Ray)", "Skin & Hair Transparent Surgeon", "Sonology", "Spinal Surgery", "Transfusion Medicine", "Urology", "Vascular Surgery", "Virology"};
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, group);
        groupChoice.setAdapter(adapter1);

        Name = (EditText) findViewById(R.id.edt_name);
        Hospital = findViewById(R.id.hospitalET);
        Mobile = (EditText) findViewById(R.id.edt_mobileNumber);

        Save = (Button) findViewById(R.id.btn_saveDonor);

        Save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = Name.getText().toString();
                String city = cityChoice.getSelectedItem().toString();
                String group = groupChoice.getSelectedItem().toString();
                String mobile = Mobile.getText().toString();
                String hospital = Hospital.getText().toString();


                Doctor doctor = new Doctor(name,mobile,city,hospital,group);
                DatabaseReference myRef = database.getReference("doctors");
                myRef.child(city).child(group).push().setValue(doctor);

                finish();
            }
        });

    }
}
