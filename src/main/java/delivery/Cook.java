package delivery;

import delivery.dishes.*;

import java.util.ArrayList;
import java.util.List;

public class Cook implements Cookable {
    private final List<CookObserver> observers = new ArrayList<>();

    public void register(Cashier cashier) {
        observers.add(cashier);
    }

    @Override
    public void cookBurger() {
        Burger burger = new Burger.Builder()
                .addBun()
                .addPatty()
                .addCheese()
                .build();
        System.out.println("\nПовар закончил готовить бургер!");
        notifyObservers(burger);
    }

    private void notifyObservers(Burger burger) {
        for (CookObserver observer : observers) {
            observer.onBurgerReady(burger);
        }
    }
}