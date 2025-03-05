package Interface;

public class SMSnotificationService implements NotificationsService
{
    private String phoneNumber;
    
    SMSnotificationService(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void sendNotifiactions(String message)
    {
        System.out.println("Sending notifications to "+phoneNumber);
    }

    @Override
    public void subscribeToTopic(String topic)
    {
        System.out.println("Subscribed "+phoneNumber+" to SMS notifications for topic: "+topic);
    }
}
