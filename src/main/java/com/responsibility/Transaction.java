package com.responsibility;

import static com.responsibility.Checking.SUCCESS;

public class Transaction extends Request {
    public void fulfillRequest(Request action) {
        System.out.println("You are sending money");
        this.setChecking(SUCCESS);
        new UserAuthorisation().fulfillRequest(this);
    }
}
