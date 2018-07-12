public class NetBanking extends Payment{
    private long acc_no;
    private String bank_name;
    private int otp;

    public NetBanking(String bank_name, long acc_no, int otp, double amount) {
        super(amount);
        this.bank_name = bank_name;
        this.acc_no = acc_no;
        this.otp = otp;
    }
}
