import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    private List<Observer> observers;

    public Subject() {
        this.observers = new ArrayList<Observer>();
    }

    public void register(Observer o){
        observers.add(o);
    }

    public void unRegister(Observer o) {
        observers.remove(o); 
    }

    public void notifyObservers() {
        for(Observer o:observers) {
            o.update(this);
        }
    }
}
