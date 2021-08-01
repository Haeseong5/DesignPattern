package DesignPattern.ObserverPattern.basic;

public class Client {
    public static void main(String[] args) {
        LiveData<Integer> liveData = new LiveData<Integer>(-1);

        liveData.observe(new Observer<Integer>() {
            @Override
            public void update(Integer value) {
                System.out.println(value);
            }
        });

        liveData.setValue(2);
        liveData.setValue(3);
        liveData.setValue(4);
        liveData.setValue(5);

        int n = liveData.getValue();

        System.out.println("getValue(): " + n);
    }
}
