package com.responsibility;

import java.util.Random;

public class Authentication extends Request {
    @Override
    public void fulfillRequest(Request action) {
        Random random = new Random();
        if (action.getChecking().equals(Checking.SUCCESS)) {
            System.out.println("Checking whether the account has enough money to compete the transaction...");
            int randNum = random.nextInt((3 - 1) + 1) + 1;
            if (randNum == 1) {
                this.setChecking(Checking.FAILURE);
                System.out.println("Not enough money. Accedd denied");
            } else {
                System.out.println("Authentication successful");
                this.setChecking(Checking.SUCCESS);
                new TransactionTax().fulfillRequest(this);
            }
        }
    }
}
