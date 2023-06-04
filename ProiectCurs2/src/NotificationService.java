import java.util.ArrayList;
import  java.util.List;
public class NotificationService {
    private List<Subscriber> subscribers;

    public NotificationService() {
        subscribers = new ArrayList<>();
    }

    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void notifySubscribers(Book book) {
        for (Subscriber subscriber : subscribers) {
            subscriber.notify(book);
        }
    }
}
