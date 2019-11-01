package com.responsibility;

import java.util.Random;

public class TransactionTax extends Request {
    @Override
    public void fulfillRequest(Request action) {
        Random random = new Random();
        this.setChecking(Checking.SUCCESS);
        System.out.println(String.format("The tax per your transaction is %s", random.nextInt((10 - 1) + 1) + 1));
        new BankApproval().fulfillRequest(this);
    }
}
