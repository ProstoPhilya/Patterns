package delivery;

public class Burger {
    private final String ingredients;

    private Burger(String ingredients) { this.ingredients = ingredients; }

    public String getIngredients() { return ingredients; }

    @Override
    public String toString() {
        return "Burger with " + ingredients;
    }

    public static class Builder {
        private String ingredients = "";

        public Builder addBun() {
            if (!ingredients.isEmpty()) {
                ingredients += ", ";
            }
            ingredients += "Bun";
            return this;
        }

        public Builder addPatty() {
            if (!ingredients.isEmpty()) {
                ingredients += ", ";
            }
            ingredients += "Patty";
            return this;
        }

        public Builder addCheese() {
            if (!ingredients.isEmpty()) {
                ingredients += ", ";
            }
            ingredients += "Cheese";
            return this;
        }

        public Builder addTomato() {
            if (!ingredients.isEmpty()) {
                ingredients += ", ";
            }
            ingredients += "Tomato";
            return this;
        }

        public Builder addOnion() {
            if (!ingredients.isEmpty()) {
                ingredients += ", ";
            }
            ingredients += "Onion";
            return this;
        }

        public Burger build() {
            return new Burger(ingredients);
        }
    }
}

