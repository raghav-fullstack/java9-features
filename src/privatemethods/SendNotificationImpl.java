package privatemethods;

public class SendNotificationImpl implements SendNotifications {

    public static void main(String[] args) {
        SendNotifications sendNotifications = new SendNotificationImpl();
        sendNotifications.sendNotification();
        sendNotifications.sendNotifications();
    }
}
