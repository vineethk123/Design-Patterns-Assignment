import java.util.*;

public class ConversionWebsite implements Subscriber{
    double usd_in_inr;
    double gbp_in_inr;
    double euro_in_inr;
    List<Update> subscribers;

    public ConversionWebsite() {
        subscribers = new ArrayList<Update>();
    }

    // Set the Currency rates and notify subscribers
    public void setCurrencyRates(double usd_in_inr, double euro_in_inr, double gbp_in_inr) {
        this.usd_in_inr = usd_in_inr;
        this.gbp_in_inr = gbp_in_inr;
        this.euro_in_inr = euro_in_inr;
        subscribersNotify();
    }

    // Add subscription
    public void subscribe(Update sb) {
        subscribers.add(sb);
    }

    // Remove subscription
    public void unsubscribe(Update sb) {
        int index = subscribers.indexOf(sb);
        if(index>=0) {
            subscribers.remove(index);
        }
    }

    // Update the currency rates in all subscribers
    public void subscribersNotify() {
        for(Update s: subscribers) {
            s.update(usd_in_inr, gbp_in_inr, euro_in_inr);
        }
    }
}
