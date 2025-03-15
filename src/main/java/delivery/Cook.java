package delivery;

import java.util.ArrayList;
import java.util.List;

interface Cookable {
    void cookBurger();
}
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
        System.out.println("Cook finished cooking the burger!");
        notifyObservers(burger);
    }

    private void notifyObservers(Burger burger) {
        for (CookObserver observer : observers) {
            observer.onBurgerReady(burger);
        }
    }
}