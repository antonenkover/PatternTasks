package com.post;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PostManager {
    private Map<Magazine, List<Subscriber>> subscribers = new HashMap<>();

    public PostManager(Magazine... magazines) {
        for (Magazine magazine : magazines) {
            this.subscribers.put(magazine, new ArrayList<>());
        }
    }

    public void subscribe(Subscriber subscriber, Magazine... magazines) {
        for (Magazine magazine : magazines) {
            List<Subscriber> subscriberList = subscribers.get(magazines);
            subscriberList.add(subscriber);
        }
    }

    public void unsubscribe(Subscriber subscriber, Magazine... magazines) {
        for (Magazine magazine : magazines) {
            List<Subscriber> subscriberList = subscribers.get(magazines);
            subscriberList.remove(subscriber);
        }
    }

    public void notify(Magazine... magazines) {
        for (Magazine magazine : magazines) {
            if (subscribers.containsKey(magazine)) {
                for (Subscriber subscriber : subscribers.get(magazine)) {
                    subscriber.update(magazine.getName());
                }
            }
        }
    }
}
