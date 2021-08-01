package DesignPattern.StatePattern.dialog;

public class BottomDialog {

    private final int type;
    private final WorldInfo worldInfo;

    public BottomDialog(int type, WorldInfo worldInfo) {
        this.type = type;
        this.worldInfo = worldInfo;
    }

}
