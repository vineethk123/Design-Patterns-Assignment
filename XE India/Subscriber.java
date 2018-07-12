public interface Subscriber {
    void subscribe(Update sb);
    void unsubscribe(Update sb);
    void subscribersNotify();
}