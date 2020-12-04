import java.util.ArrayList;

public class BabyData implements Subject {
    private ArrayList observers;
    private boolean cry;
    private int level;

    public BabyData() {
        observers = new ArrayList();
    }
    public void registerObserver(Observer o) {
        observers.add(o);
    }
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0 ) {
            observers.remove(i);
        }
    }
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer)observers.get(i);
            observer.update(cry, level);
        }
    }
    public void setBaby(boolean cry, int level) {
        this.cry = cry;
        this.level = level;
        notifyObservers();
    }
}
