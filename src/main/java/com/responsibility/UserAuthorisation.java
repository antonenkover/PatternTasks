package com.responsibility;

import java.util.Random;

public class UserAuthorisation extends Request {
    @Override
    public void fulfillRequest(Request action) {
        Random random = new Random();
        if (action.getChecking().equals(Checking.SUCCESS)) {
            System.out.println("Enter the card password");
            int randNumber = random.nextInt((3 - 1) + 1) + 1;
            if (randNumber == 1) {
                this.setChecking(Checking.FAILURE);
                System.out.println("Unauthorised user. Wrong password.");
            } else {
                System.out.println("Password is correct. Authorisation completed");
                this.setChecking(Checking.SUCCESS);
                new Authentication().fulfillRequest(this);
            }
        }
    }
}
