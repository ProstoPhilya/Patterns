package delivery;

import delivery.dishes.Burger;

public interface CookObserver {
    void onBurgerReady(Burger burger);
}
