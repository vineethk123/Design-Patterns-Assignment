public class ChennaiChart implements Chart {
    private Micro micro;
    private Mini mini;
    private Sedan sedan;

    public ChennaiChart() {
        this.micro = new Micro();
        this.mini = new Mini();
        this.sedan = new Sedan();
    }

    @Override
    public void getRateChart() {
        System.out.println("\nRate Chart for Chennai(In INR):\n");
        System.out.println("Micro: " + micro.getPrice() + "\nMini: " + mini.getPrice() + "\nSedan: " + sedan.getPrice());
    }
}
