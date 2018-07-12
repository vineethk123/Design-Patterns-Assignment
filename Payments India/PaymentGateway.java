import java.util.*;

public class PaymentGateway {

    public static void main(String args[]) {
        // Payment Declines if the randomly generated balance is less than the amount passed
        Payment method1 = PaymentFactory.getPaymentMethod("creditcard", null, 364823412,
                123, 5000);
        Payment method2 = PaymentFactory.getPaymentMethod("debitcard", null, 364823412,
                123, 5000);
        Payment method3 = PaymentFactory.getPaymentMethod("wallet", null, 364823412,
                123, 5000);
        Payment method4 = PaymentFactory.getPaymentMethod("Netbanking", null, 364823412,
                123, 5000);
        Payment method5 = PaymentFactory.getPaymentMethod("cashondelivery", null, 364823412,
                123, 5000);

        List<Payment> payment_methods= new ArrayList<Payment>();
        payment_methods.add(method1);
        payment_methods.add(method2);
        payment_methods.add(method3);
        payment_methods.add(method4);
        payment_methods.add(method5);

        for(Payment i: payment_methods) {
            if(i == null) {
                System.out.println("Invalid Payment Type");
            }
            else {
                method1.makeTransaction();
            }
        }
    }
}
