package com.rotnocse.curehealth.doctor;

public class Doctor {
    String name;
    String contuctNumber;
    String city;
    String hospital;
    String specility;

    public Doctor(String name, String contuctNumber, String city, String hospital, String specility) {
        this.name = name;
        this.contuctNumber = contuctNumber;
        this.city = city;
        this.hospital = hospital;
        this.specility = specility;
    }

    public Doctor() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContuctNumber() {
        return contuctNumber;
    }

    public void setContuctNumber(String contuctNumber) {
        this.contuctNumber = contuctNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public String getSpecility() {
        return specility;
    }
}
