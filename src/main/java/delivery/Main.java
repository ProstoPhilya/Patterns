package delivery;

public class Main {
    public static void main(String[] args) {
        Cashier cashier = Cashier.getInstance();

        Cook cook = new Cook();
        cook.register(cashier);

        cook.cookBurger();
    }
}