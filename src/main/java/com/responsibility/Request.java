package com.responsibility;

public abstract class Request {
    private Checking checking;

    protected Checking getChecking() {
        return checking;
    }

    protected void setChecking(Checking checking) {
        this.checking = checking;
    }

    public abstract void fulfillRequest(Request action);
}
