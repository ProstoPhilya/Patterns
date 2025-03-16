package delivery.dishes;

public class ClassicBurgerDecorator extends BurgerDecorator {
    public ClassicBurgerDecorator(Cookable cookable) {
        super(cookable);
    }

    @Override
    public void cookBurger() {
        super.cookBurger();
    }
}
