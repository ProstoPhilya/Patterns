package delivery.dishes;

public class VeggieBurgerDecorator extends BurgerDecorator {
    public VeggieBurgerDecorator(Cookable cookable) {
        super(cookable);
    }

    @Override
    public void cookBurger() {
        super.cookBurger();
        System.out.println("Замените котлету на вегетарианскую котлету в вегетарианском бургере.");
    }
}
