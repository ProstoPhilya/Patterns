package delivery.dishes;

public class Burger {
    private final String ingredients;

    private Burger(String ingredients) { this.ingredients = ingredients; }

    public String getIngredients() { return ingredients; }

    @Override
    public String toString() {
        return "Бургер с " + ingredients;
    }

    public static class Builder {
        private String ingredients = "";

        public Builder addBun() {
            if (!ingredients.isEmpty()) {
                ingredients += ", ";
            }
            ingredients += "Булочкой";
            return this;
        }

        public Builder addPatty() {
            if (!ingredients.isEmpty()) {
                ingredients += ", ";
            }
            ingredients += "Котлетой";
            return this;
        }

        public Builder addCheese() {
            if (!ingredients.isEmpty()) {
                ingredients += ", ";
            }
            ingredients += "Сыром";
            return this;
        }

        public Builder addTomato() {
            if (!ingredients.isEmpty()) {
                ingredients += ", ";
            }
            ingredients += "Помидором";
            return this;
        }

        public Builder addJalapeno() {
            if (!ingredients.isEmpty()) {
                ingredients += ", ";
            }
            ingredients += "Халапеньо";
            return this;
        }

        public Burger build() {
            return new Burger(ingredients);
        }
    }
}

