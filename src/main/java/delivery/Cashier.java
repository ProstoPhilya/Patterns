package delivery;

import delivery.dishes.Burger;

public class Cashier implements CookObserver {
    private static Cashier instance;

    private Cashier() {}

    public static Cashier getInstance() {
        if (instance == null) {
            instance = new Cashier();
        }
        return instance;
    }

    public void receiveBurger(Burger burger) {
        System.out.println("Кассир получил: " + burger.toString() + "\n");
    }

    @Override
    public void onBurgerReady(Burger burger) {
        receiveBurger(burger);
    }
}
