package com.rotnocse.curehealth.doctor;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.rotnocse.curehealth.R;

import java.util.ArrayList;

public class DoctorAdapter extends ArrayAdapter<Doctor> implements View.OnClickListener {

private ArrayList<Doctor> dataSet;
        Context mContext;

// View lookup cache
private static class ViewHolder {
    TextView name;
    TextView number;
    TextView hospital;
}

    public DoctorAdapter(ArrayList<Doctor> data, Context context) {
        super(context, R.layout.doctor_list, data);
        this.dataSet = data;
        this.mContext = context;

    }

    @Override
    public void onClick(View v) {

        int position = (Integer) v.getTag();
        Object object = getItem(position);
        Doctor doctor = (Doctor) object;

       /* switch (v.getId()) {
            case R.id.phoneTV:
                Snackbar.make(v, "Release date " + donor.getContuctNumber(), Snackbar.LENGTH_LONG)
                        .setAction("No action", null).show();
                break;
        }*/
    }

    private int lastPosition = -1;

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        Doctor doctor = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        DoctorAdapter.ViewHolder viewHolder; // view lookup cache stored in tag

        final View result;

        if (convertView == null) {

            viewHolder = new DoctorAdapter.ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.doctor_list, parent, false);
            viewHolder.name = (TextView) convertView.findViewById(R.id.nameTV);
            viewHolder.number = (TextView) convertView.findViewById(R.id.phoneTV);
            viewHolder.hospital = (TextView) convertView.findViewById(R.id.hospitalTV);
            result = convertView;

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (DoctorAdapter.ViewHolder) convertView.getTag();
            result = convertView;
        }

        Animation animation = AnimationUtils.loadAnimation(mContext, (position > lastPosition) ? R.anim.up_from_bottom : R.anim.down_from_top);
        result.startAnimation(animation);
        lastPosition = position;

        viewHolder.name.setText(doctor.getName());
        viewHolder.number.setText(doctor.getContuctNumber());
        viewHolder.hospital.setText(doctor.getHospital());
        // Return the completed view to render on screen
        return convertView;
    }
}