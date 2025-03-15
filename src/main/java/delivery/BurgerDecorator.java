package delivery;

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
    public static class ClassicBurgerDecorator extends BurgerDecorator {
        public ClassicBurgerDecorator(Cookable cookable) {
            super(cookable);
        }

        @Override
        public void cookBurger() {
            super.cookBurger();
            System.out.println("Adding ketchup and mustard to classic burger.");
        }
    }

    public class VeggieBurgerDecorator extends BurgerDecorator {
        public VeggieBurgerDecorator(Cookable cookable) {
            super(cookable);
        }

        @Override
        public void cookBurger() {
            super.cookBurger();
            System.out.println("Replacing patty with veggie patty in vegetarian burger.");
        }
    }

    public class MexicanBurgerDecorator extends BurgerDecorator {
        public MexicanBurgerDecorator(Cookable cookable) {
            super(cookable);
        }

        @Override
        public void cookBurger() {
            super.cookBurger();
            System.out.println("Adding jalapenos and salsa to mexican burger.");
        }
    }
}
