package Interface;

public class EmailService implements NotificationsService
{
    private String email;
    
    public EmailService(String email)
    {
        this.email = email;
    }

    @Override
    public void sendNotifiactions(String message) 
    {
       System.out.println("Sending email notifications to "+email);
    }

    @Override
    public void subscribeToTopic(String topic) 
    {
        System.out.println("Subscribed "+email+" email notifications for topic: ");
    }

}
