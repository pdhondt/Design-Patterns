package be.vdab.singleton;

public enum Motor {
    INSTANCE;
    private boolean gestart;
    void start() {
        gestart = true;
        System.out.println("motor gestart");
    }
    void stop() {
        if (gestart) {
            gestart = false;
            System.out.println("motor gestopt");
        }
    }
}
