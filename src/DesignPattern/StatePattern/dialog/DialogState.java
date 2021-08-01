package DesignPattern.StatePattern.dialog;


interface DialogState {
    void setWorldTab(BottomDialog bottomDialog);
    void setHomeTab(BottomDialog bottomDialog);
}
