package DesignPattern.ObserverPattern.basic;

public class LiveData<T> extends Subject<T> {

    private T value;

    public LiveData(T defaultValue) {
        this.value = defaultValue;
    }

    public void setValue(T value) {
        this.value = value;
        notifyObservers(value);
    }

    public T getValue() {
        return value;
    }

}
