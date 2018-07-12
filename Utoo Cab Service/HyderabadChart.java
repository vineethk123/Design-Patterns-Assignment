public class HyderabadChart implements Chart {
    private Micro micro;
    private Mini mini;
    private SUV suv;

    public HyderabadChart() {
        this.micro = new Micro();
        this.mini = new Mini();
        this.suv = new SUV();
    }

    @Override
    public void getRateChart() {
        System.out.println("\nRate Chart for Hyderabad(In INR):\n");
        System.out.println("Micro: " + micro.getPrice() + "\nMini: " + mini.getPrice() + "\nSUV: " + suv.getPrice());
    }
}
