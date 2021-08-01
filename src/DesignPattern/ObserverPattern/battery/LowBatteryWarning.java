package DesignPattern.ObserverPattern.battery;

public class LowBatteryWarning implements Observer {
    private final Battery battery;
    private final int LOW_BATTERY = 30;

    public LowBatteryWarning(Battery battery) {
        this.battery = battery;
    }

    @Override
    public void update() {
        int level = battery.getLevel();
        if (level < LOW_BATTERY) {
            System.out.println(this.getClass().getSimpleName() + ": " + level);
        }
    }
}
