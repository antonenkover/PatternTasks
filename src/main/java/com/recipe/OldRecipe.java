package com.recipe;

public class OldRecipe implements Recipe {

    String expirationDate;
    String prescription;

    public OldRecipe(String expirationDate, String prescription) {
        this.expirationDate = expirationDate;
        this.prescription = prescription;
    }

    @Override
    public String getExpirationDate() {
        return expirationDate;
    }

    @Override
    public String getDoctorPrescription() {
        return prescription;
    }
}
