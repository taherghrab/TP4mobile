package com.example.taherghrab.controller;

import com.example.taherghrab.model.Patient;

public class Controller {
    public Patient patient;
    public Controller() {}
    public int createPatient(int age, String vm, boolean jeuner) {
        if (age <= 0 && vm.isEmpty()) {
            return 1;
        }else if( age <=0)
            return -1;
        else if (vm.isEmpty())
            return -2;

        patient = new Patient(age, vm, jeuner);
        return 0;
    }
    public String getReponse(){
        return patient.getRes();
    }

}
