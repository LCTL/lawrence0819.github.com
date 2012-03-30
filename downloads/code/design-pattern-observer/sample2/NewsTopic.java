import java.util.HashSet;
import java.util.Set;

public class NewsTopic implements Subject {

    private final Set<Observer> obervers = new HashSet<Observer>();
    private String message;
    
    public void pushMessage(String message) {
        this.message = message;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        obervers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        obervers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: obervers){
            observer.notify(message);
        }
    }

}
