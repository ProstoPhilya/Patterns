package delivery;

public class Main {
    public static void main(String[] args) {

        Cook cook = new Cook();
        Cookable secureCook = new SecurityProxy(cook);

        Cashier cashier = Cashier.getInstance();
        cook.register(cashier);

        cook.cookBurger();

        Cookable classicburger = new BurgerDecorator.ClassicBurgerDecorator(secureCook);
    }
}