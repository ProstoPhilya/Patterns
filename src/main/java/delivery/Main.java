package delivery;

public class Main {
    public static void main(String[] args) {
        Cashier cashier = Cashier.getInstance();

        Cook cook = new Cook();
        Cookable secureCook = new SecurityProxy(cook);

        cashier = Cashier.getInstance();
        cook.register(cashier);

        cook.cookBurger();
    }
}