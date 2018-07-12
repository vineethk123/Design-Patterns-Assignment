public class BengaluruChart implements Chart {
    private Micro micro;
    private Mini mini;
    private Sedan sedan;
    private SUV suv;

    public BengaluruChart() {
        this.micro = new Micro();
        this.mini = new Mini();
        this.sedan = new Sedan();
        this.suv = new SUV();
    }

    @Override
    public void getRateChart() {
        System.out.println("\nRate Chart for Bengaluru(In INR):\n");
        System.out.println("Micro: " + micro.getPrice() + "\nMini: " + mini.getPrice() + "\nSedan: " + sedan.getPrice() +
                "\nSUV: " + suv.getPrice());
    }
}
