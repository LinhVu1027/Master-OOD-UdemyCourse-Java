package singletondesignpattern;

public class PerformanceStage {

    private static PerformanceStage INSTANCE;
    private static int COUNTER;

    private PerformanceStage() {
        COUNTER++;
    }

    public static PerformanceStage getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new PerformanceStage();
        }
        return  INSTANCE;
    }

    public void turnOnLights() {
        System.out.println("turned on lights...");
    }

    public int getCounter() {
        return COUNTER;
    }


}
