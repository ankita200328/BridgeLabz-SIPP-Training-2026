package FitnesTracker;

public class FitnessDevice implements Tracker, Reportable, {
    @Override
    public void logActivity() {
        System.out.println("Activity Logged: 5000 steps completed.");
    }

    @Override
    public void generateReport() {
        System.out.println("Report: Calories Burned = 350");
    }

    @Override
    public void sendAlert() {
        System.out.println("Alert: Time to drink water!");
    }
}
