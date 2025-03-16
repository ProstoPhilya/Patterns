package delivery.dishes;

// Абстрактный декоратор для приготовления различных видов бургеров
public abstract class BurgerDecorator implements Cookable {
    protected Cookable cookable;

    public BurgerDecorator(Cookable cookable) {
        this.cookable = cookable;
    }

    @Override
    public void cookBurger() {
        cookable.cookBurger();
    }
}

