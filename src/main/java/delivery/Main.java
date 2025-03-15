package delivery;

public class Main {
    public static void main(String[] args) {
        Burger burger = new Burger.Builder().
                addBun().
                addPatty().
                addCheese().
                addTomato().build();

        System.out.println(burger);
    }
}