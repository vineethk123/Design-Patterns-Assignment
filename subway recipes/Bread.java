public class Bread {
    // Required Parameter
    private String size;
    // Optional Parameter
    private String bake;
    public double price;

    public Bread(BreadBuilder my_bread_builder) {
        this.size = my_bread_builder.size;
        this.bake = my_bread_builder.bake;
        this.price = 0;
    }

    public String toString() {
        return "Bread:\n" + "Size: " + size + "\n" + "Bake: " + bake + "\n";
    }

    public double getPrice() {
        if("small".equalsIgnoreCase(size)) {
            price += 5;
        }
        else if("medium".equalsIgnoreCase(size)) {
            price += 10;
        }
        else {
            price += 15;
        }

        if("mild".equalsIgnoreCase(size)) {
            price += 1;
        }
        else {
            price += 3;
        }

        return price;
    }

    public static class BreadBuilder {
        // Required Parameter
        private String size;
        // Optional Parameter
        private String bake;

        public BreadBuilder(String size) {
            this.size = size;
        }

        public BreadBuilder setBake(String bake) {
            this.bake = bake;
            return this;
        }

        public Bread build() {
            return new Bread(this);
        }
    }
}
