package Observer.src;

import java.util.ArrayList;
import java.util.List;

public class PropertyListing implements Subject {

    private final List<Observer> observers = new ArrayList<>();

    private String propertyName;
    private int price;

    public PropertyListing(String propertyName, int price) {
        this.propertyName = propertyName;
        this.price = price;
    }

    public void setPrice(int newPrice) {
        this.price = newPrice;
        notifyObservers();
    }

    public int getPrice() {
        return price;
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        String message = "Le bien '" + propertyName + "' a un nouveau prix : " + price + " €";
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}

