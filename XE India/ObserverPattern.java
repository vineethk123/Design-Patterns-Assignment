public class ObserverPattern {
    public static void main(String args[]) {
        ConversionWebsite website = new ConversionWebsite();
        Subscriber1 sub1 = new Subscriber1(website);
        Subscriber2 sub2 = new Subscriber2(website);

        website.setCurrencyRates(67.1312, 68.124, 77.1);
        website.unsubscribe(sub1);
        website.setCurrencyRates(69.123, 68.213, 76.812);
    }
}
