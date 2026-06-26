package SmartNotificationSystem;

public class NotificationDemo {
    public static void main(String[] args) {

        Notification[] notifications = {
                new EmailNotification("Ankita", "Welcome!"),
                new SMSNotification("Rahul", "OTP:1234"),
                new PushNotification("Priya", "New Offer Available")
        };

        System.out.println("Sent Notifications:");

        for (Notification n : notifications) {
            n.sendNotification();
        }
    }
}
