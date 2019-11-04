package com.recipe;

public class ModifiedRecipe implements Recipe {

    OldRecipe oldRecipe;
    String newExpirationDate;

    public ModifiedRecipe(OldRecipe oldRecipe) {
        this.oldRecipe = oldRecipe;
    }

    public void setNewExpirationDate(String newExpirationDate) {
        this.newExpirationDate = newExpirationDate;
    }

    @Override
    public String getExpirationDate() {
        if (newExpirationDate != null) {
            return newExpirationDate;
        }
        return oldRecipe.getExpirationDate();
    }

    @Override
    public String getDoctorPrescription() {
        return oldRecipe.getDoctorPrescription();
    }
}
