package com.recipe;

public class Main {
    public static void main(String[] args) {
        OldRecipe oldRecipe = new OldRecipe("22/10/2019", "Take one pill per day");
        ModifiedRecipe modifiedRecipe = new ModifiedRecipe(oldRecipe);
        changeExpirationDate(oldRecipe, modifiedRecipe);
    }

    public static void changeExpirationDate(OldRecipe oldRecipe, ModifiedRecipe modifiedRecipe) {
        modifiedRecipe.setNewExpirationDate("22/11/2019");
        Recipe recipe = modifiedRecipe;
        System.out.println("Original expiration date: " + oldRecipe.getExpirationDate());
        System.out.println("New expiration date: " + recipe.getExpirationDate());
    }
}
