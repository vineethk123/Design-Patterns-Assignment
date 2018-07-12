public class Wallet extends Payment{
    private long wallet_no;
    private int otp;

    public Wallet(long wallet_no, int otp, double amount) {
        super(amount);
        this.wallet_no = wallet_no;
        this.otp = otp;
    }
}
