package com.responsibility;


public class InitProcess {
    private Request request;

    public InitProcess() {
        request = new Transaction();
    }

    public void startTransaction() {
        request.fulfillRequest(request);
    }
}
