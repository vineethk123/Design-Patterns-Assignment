import java.util.Random;

public class Payment {
    protected long transaction_id;
    protected Random rand;
    protected double amount;

    public Payment(double amount) {
        this.amount = amount;
        rand = new Random();
    }

    public double getAmount() {
        return amount;
    }

    public long getTransactionID() {
        return Math.abs(rand.nextLong());
    }

    public void makeTransaction() {
        int balance = rand.nextInt(20000);
        System.out.println("Account Balance: " + balance);
        if(balance >= amount) {
            balance -= amount;
            displayConfirmation();
        }
        else {
            System.out.println("Payment Declined!\n");
        }
    }

    public void displayConfirmation() {
        String str = "Order Summary:\n\n" + "Payment Method: Creditcard\n" + "Amount: " + getAmount() +
                "\nTransactionID: " + getTransactionID();
        System.out.println(str);
        System.out.println("Your Order is Confirmed!\n");
    }
}
