/**
 * Created by Duncol on 2016-11-12.
 */
public interface Subject {
    void addSubscriber(Observer o);
    void releaseSubscriber(Observer o);
    void updateSubscribers(Paper p);

}
