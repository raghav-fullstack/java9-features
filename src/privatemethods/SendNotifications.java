package privatemethods;

public interface SendNotifications {

    default void sendNotifications() {
        establishingConnection();
        System.out.println("Sending multiple notifications.");
    }


    default void sendNotification() {
        establishingConnection();
        System.out.println("Sending single notifications.");
    }

    private void establishingConnection() {
        System.out.println("Establishing connections.");
    }

}
