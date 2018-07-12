public class CashOnDelivery extends Payment{
    private long acc_no;
    private int otp;

    public CashOnDelivery(long acc_no, int otp, double amount) {
        super(amount);
        this.acc_no = acc_no;
        this.otp = otp;
    }
}
