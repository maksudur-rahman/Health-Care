package com.rotnocse.curehealth.doctor;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.rotnocse.curehealth.R;

public class NeedDoctor extends AppCompatActivity {

    Spinner groupChoice;
    Spinner cityChoice;
    Button need;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_need_doctor);

        cityChoice = (Spinner) findViewById(R.id.needCity);
        groupChoice = (Spinner) findViewById(R.id.needSpeciality);
        need = (Button) findViewById(R.id.startSearch);

        String[] citis = new String[]{"Barisal","Chittagong", "Dhaka", "Mymensingh","Khulna", "Rajshahi", "Rangpur", "Sylhet"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, citis);
        cityChoice.setAdapter(adapter);


        String[] group = new String[]{"Acupuncture","Addition Psychiatrist", "Allergy and Asthma", "Anaesthesiology","Anatomy", "Biochemistry", "Cancer Specialist", "Cardiac Surgery",
                "Cardiology", "Chest Diseases", "Child (Paediatric)", "Clinical Hematology", "Clinical Psychology", "Dental", "Diabetology", "Embryologist", "Family Practice",
                "Dermatology", "General Physician", "General Surgery", "Gynaelogy", "Haematology", "Head and Neck Surgery","Hepatology", "Herbal", "Homoeopathic", "Infectious Disease", "Junior Consultant",
                "Laboratory Services", "Medical Microbiology", "Medicine", "Nephrology (Kidney)", "Neurology", "Neuromedicine", "Neurosurgery", "Nuclear Medicine and Ultrasound", "Occupational Therapist",
                "Oncology (Cancer/Tumour)", "Ophthalmology ( Eye )", "Oral and Maxillofacial Surgery", "Orthopaedic Surgery", "Orthopaedics", "Paediatric Hematology", "Paediatric Neurology", "Paediatric Oncology",
                "Paediatric Surgery", "Pathology", "Pediatric Gastroenterology", "Pediatric Neonatology", "Pediatric Neurosurgury", "Pharmacology", "Physical Medicine", "Piles (Colon and Rectal Surgery)", "Plastic Surgery",
                "Psychiatrist", "Pulmonology", "Radiology (X-Ray)", "Skin & Hair Transparent Surgeon", "Sonology", "Spinal Surgery", "Transfusion Medicine", "Urology", "Vascular Surgery", "Virology"};
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, group);
        groupChoice.setAdapter(adapter1);


        need.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String group = groupChoice.getSelectedItem().toString();
                String city = cityChoice.getSelectedItem().toString();

                Intent intent = new Intent(NeedDoctor.this, DoctorProfile.class);
                intent.putExtra("group", group);
                intent.putExtra("city", city);
                startActivity(intent);
            }
        });

    }
}
