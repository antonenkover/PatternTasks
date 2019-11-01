package com.post;

public class SubscriptionService implements Subscriber {
    private String name;
    private String postalAddress;

    public SubscriptionService(String name, String postalAddress) {
        this.name = name;
        this.postalAddress = postalAddress;
    }

    @Override
    public void update(String subscription) {
        System.out.printf("New issue of %s was delievered to %s, %s.", subscription, name, postalAddress);
    }
}
