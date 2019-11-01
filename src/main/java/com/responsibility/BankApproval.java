package com.responsibility;

import java.util.Random;

public class BankApproval extends Request {
    @Override
    public void fulfillRequest(Request action) {
        Random random = new Random();
        int randNum = random.nextInt((3 - 1) + 1) + 1;
        if (randNum == 1) {
            this.setChecking(Checking.SUCCESS);
            System.out.println("Your transaction was approved by bank");
        } else {
            System.out.println("Your transaction was declined by bank due to technical reasons");
            this.setChecking(Checking.FAILURE);
        }
    }
}
