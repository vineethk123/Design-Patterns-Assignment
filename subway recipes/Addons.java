public class Addons {
    private boolean cheese;
    private boolean veggies;
    public double price;

    private Addons() {}

    private Addons(AddonsBuilder addbuilder) {
        this.cheese = addbuilder.cheese;
        this.veggies = addbuilder.veggies;
    }

    public boolean hasCheese() {
        return cheese;
    }

    public boolean hasVeggies() {
        return veggies;
    }

    public double getPrice() {
        if(hasCheese()) {
            price += 15;
        }
        if(hasVeggies()) {
            price += 10;
        }
        return price;
    }

    public String toString() {
        return "Addons:\n" + "Cheese: " + hasCheese() + "\n" + "Veggies: " + hasVeggies() + "\n";
    }

    public static class AddonsBuilder {
        private boolean cheese;
        private boolean veggies;

        public AddonsBuilder() {}

        public AddonsBuilder addCheese() {
            this.cheese = true;
            return this;

        }

        public AddonsBuilder addVeggies() {
            this.veggies = true;
            return this;
        }

        public Addons build() {
            return new Addons(this);
        }
    }
}
