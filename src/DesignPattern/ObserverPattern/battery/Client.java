package DesignPattern.ObserverPattern.battery;

public class Client {
    public static void main(String[] args) {
        Battery battery = new Battery();

        BatteryLevelDisplay batteryLevelDisplay = new BatteryLevelDisplay(battery);
        LowBatteryWarning lowBatteryWarning = new LowBatteryWarning(battery);

        battery.attach(batteryLevelDisplay);
        battery.attach(lowBatteryWarning);

        battery.consume(50);
        battery.consume(30);

        battery.detach(batteryLevelDisplay);

        battery.consume(10);
    }
}
