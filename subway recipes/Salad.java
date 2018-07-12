public class Salad {
    private boolean tomato;
    private boolean capsicum;
    private boolean carrot;
    private boolean radish;
    public double price;
    
    public Salad(SaladBuilder sbuild) {
        this.tomato = sbuild.tomato;
        this.capsicum = sbuild.capsicum;
        this.carrot = sbuild.carrot;
        this.radish = sbuild.radish;
    }

    public boolean hasTomato() {
        return this.tomato;
    }

    public boolean hasCapsicum() {
        return this.capsicum;
    }

    public boolean hasCarrot() {
        return this.carrot;
    }

    public boolean hasRadish() {
        return  this.radish;
    }

    public double getPrice() {
        if(hasTomato()) {
            price += 3;
        }
        if(hasCapsicum()) {
            price += 3;
        }
        if(hasCarrot()) {
            price += 3;
        }
        if(hasRadish()) {
            price += 3;
        }

        return price;
    }

    public String toString() {
        return "Salad:\n" + "Tomatoes: " + hasTomato() + "\nCapsicum: " + hasCapsicum() + "\nCarrot: " +
                hasCarrot() + "\nRadish: " + hasRadish();
    }
    
    public static class SaladBuilder {
        private boolean tomato;
        private boolean capsicum;
        private boolean carrot;
        private boolean radish;
        
        public SaladBuilder() {}

        public SaladBuilder addTomatoes() {
            this.tomato = true;
            return this;
        }

        public SaladBuilder addCapsicum() {
            this.capsicum = true;
            return this;
        }

        public SaladBuilder addCarrot() {
            this.carrot = true;
            return this;
        }

        public SaladBuilder addRadish() {
            this.radish = true;
            return this;
        }
        
        public Salad build() {
            return new Salad(this);
        }
    }
}
