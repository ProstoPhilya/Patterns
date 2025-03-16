package delivery.dishes;

public class VeggieBurgerDecorator extends BurgerDecorator {
    public VeggieBurgerDecorator(Cookable cookable) {
        super(cookable);
    }

    @Override
    public void cookBurger() {
        System.out.println("Заменяем котлету на вегетарианскую котлету в вегетарианском бургере.");
        super.cookBurger();
    }
}
