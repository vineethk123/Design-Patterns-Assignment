public class Sauce {
    private boolean chilli;
    private boolean mustard;
    private boolean mayonnaise;
    public double price;

    private Sauce(SauceBuilder sbuild) {
        this.chilli = sbuild.chilli;
        this.mayonnaise = sbuild.mayonnaise;
        this.mustard = sbuild.mustard;
    }

    public boolean hasChilli() {
        return chilli;
    }

    public boolean hasMustard() {
        return mustard;
    }

    public boolean hasMayonnaise() {
        return mayonnaise;
    }

    public double getPrice() {
        if(hasChilli()) {
            price += 3;
        }
        if(hasMayonnaise()) {
            price += 3;
        }
        if(hasMustard()) {
            price += 3;
        }

        return price;
    }

    public String toString() {
        return "Sauces:\n" + "Chilli: " + hasChilli() + "\nMustard: " + hasMustard() + "\nMayonnaise: " +
                hasMayonnaise() + "\n";
    }


    public static class SauceBuilder {
        private boolean chilli;
        private boolean mustard;
        private boolean mayonnaise;

        public SauceBuilder() {}

        public SauceBuilder addChilli() {
            this.chilli = true;
            return this;
        }

        public SauceBuilder addMustard() {
            this.mustard = true;
            return this;
        }

        public SauceBuilder addMayonnaise() {
            this.mayonnaise = true;
            return this;
        }

        public Sauce build() {
            return new Sauce(this);
        }
    }
}
