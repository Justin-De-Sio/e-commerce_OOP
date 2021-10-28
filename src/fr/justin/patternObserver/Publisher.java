package fr.justin.patternObserver;

import java.util.ArrayList;
import java.util.List;

public class Publisher {

    List<Subscriber> subscribers = new ArrayList<>();

    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void notifySubscriber(float promotion, String nom) {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(promotion, nom);
        }
    }

}
