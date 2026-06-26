package FitnesTracker;

public class FitnessTracker {
    public static void main(String[] args) {

        FitnessDevice device = new FitnessDevice();

        device.logActivity();
        device.generateReport();
        device.sendAlert();
        device.resetData(); // Default method
    }
}
