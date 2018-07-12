public class CreditCard extends Payment{
    private long card_no;
    private int cvv;

    public CreditCard(long card_no, int cvv, double amount) {
        super(amount);
        this.card_no = card_no;
        this.cvv = cvv;
    }
}
