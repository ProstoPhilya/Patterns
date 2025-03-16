package delivery.dishes;

public class MexicanBurgerDecorator extends BurgerDecorator {
    public MexicanBurgerDecorator(Cookable cookable) {
        super(cookable);
    }

    @Override
    public void cookBurger() {
        super.cookBurger();
        System.out.println("Добавляем халапеньо и сальсу в мексиканский бургер.");
    }
}
