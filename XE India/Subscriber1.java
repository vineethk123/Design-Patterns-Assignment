public class Subscriber1 implements Update {
    private double usd_in_inr;
    private double gbp_in_inr;
    private double euro_in_inr;
    private Subscriber sb;

    public Subscriber1(Subscriber sb) {
        this.sb = sb;
        sb.subscribe(this);
    }

    public void update(double usd_in_inr, double euro_in_inr, double gbp_in_inr) {
        this.usd_in_inr = usd_in_inr;
        this.gbp_in_inr = gbp_in_inr;
        this.euro_in_inr = euro_in_inr;
        display();
    }

    public void display() {
        System.out.println("Currency Conversion Rates of INR in USD, GBP and Euro(Subscriber1):");
        System.out.printf("%.2f\n%.2f\n%.2f\n", usd_in_inr, gbp_in_inr, euro_in_inr);
    }
}
