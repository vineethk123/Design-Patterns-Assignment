public class DebitCard extends Payment{
    private long card_no;
    private int cvv;

    public DebitCard(long card_no, int cvv, double amount) {
        super(amount);
        this.card_no = card_no;
        this.cvv = cvv;
    }
}

