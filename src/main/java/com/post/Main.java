package com.post;

import static com.post.Magazine.*;

public class Main {
    private static SubscriptionService subscriber1 = new SubscriptionService("Ivan Ivanov", "Kuiv, Happy street 15, 01010");
    private static SubscriptionService subscriber2 = new SubscriptionService("Sergii Petrov", "Lviv, River street 4, 02086");
    private static SubscriptionService subscriber3 = new SubscriptionService("Petya Ivanov", "Kharkiv, Lazy street 23/2, 03175");
    private static SubscriptionService subscriber4 = new SubscriptionService("Vasya Petrov", "Kuiv, Sad street 60/2, 0012");

    private static PostManager postManager = new PostManager(NEWS, FASHION, COOKING);

    public static void main(String[] args) {
        postManager.subscribe(subscriber1, NEWS);
        postManager.subscribe(subscriber2, FASHION);
        postManager.subscribe(subscriber3, COOKING);
        postManager.subscribe(subscriber4, COOKING);

        postManager.notify(NEWS);
        postManager.notify(FASHION);
        postManager.notify(COOKING);

        postManager.unsubscribe(subscriber3);

        postManager.notify(COOKING);
    }
}
