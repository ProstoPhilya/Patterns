package delivery;

import delivery.dishes.*;

public class Main {
    public static void main(String[] args) {

        Cook cook = new Cook();
        Cookable secureCook = new SecurityProxy(cook);

        Cookable classicburger = new ClassicBurgerDecorator(secureCook);
        Cookable veggieBurger = new VeggieBurgerDecorator(secureCook);
        Cookable mexicanBurger = new MexicanBurgerDecorator(secureCook);

        Cashier cashier = Cashier.getInstance();
        cook.register(cashier);

        cook.cookBurger();

        classicburger.cookBurger();

        veggieBurger.cookBurger();

        mexicanBurger.cookBurger();
    }
}