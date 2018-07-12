public class PaymentFactory {

    // Get the appropriate payment method
    public static Payment getPaymentMethod(String paymentType, String bank_name, long acc_no,
                                           int otp, double amount){
        if("CreditCard".equalsIgnoreCase(paymentType)) {
            return new CreditCard(acc_no, otp, amount);
        }
        else if("DebitCard".equalsIgnoreCase(paymentType)) {
            return new DebitCard(acc_no, otp, amount);
        }
        else if("Wallet".equalsIgnoreCase(paymentType)) {
            return new Wallet(acc_no, otp, amount);
        }
        else if("NetBanking".equalsIgnoreCase(paymentType)) {
            return new NetBanking(bank_name, acc_no, otp, amount);
        }
        else if("CashOnDelivery".equalsIgnoreCase(paymentType)) {
            return new CashOnDelivery(acc_no, otp, amount);
        }
        else {
            return null;
        }
    }
}
