package delivery;

public class SecurityProxy implements Cookable {
    private Cookable cook;

    public SecurityProxy(Cookable cook) {
        this.cook = cook;
    }

    @Override
    public void cookBurger() {
        if (isSecure()) {
            cook.cookBurger();
        } else {
            System.out.println("Cannot cook due to security concerns.");
        }
    }

    private boolean isSecure() {
        // Здесь можно вставить любую проверку, например, проверка наличия свежих ингредиентов
        return true;
    }
}
