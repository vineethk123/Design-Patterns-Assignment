public class Cab {
    double price_per_km;
    double waiting_time_price;
    double price_per_minute;

    public Cab(double price_per_km, double waiting_time_price, double price_per_minute) {
        this.price_per_km = price_per_km;
        this.waiting_time_price = waiting_time_price;
        this.price_per_minute = price_per_minute;
    }

    String getPrice() {
        return "\nPrice per KM: " + price_per_km + "\nWaiting time price: " + waiting_time_price +
                "\n" + "Price per Minute: " + price_per_minute;
    }
}
