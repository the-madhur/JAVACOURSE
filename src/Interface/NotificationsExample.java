package Interface;

// Main Class
public class NotificationsExample 
{
    public static void main(String[] args) 
    {
        NotificationsService emailService = new EmailService("usermadhur@gmail.com");
        NotificationsService smsService = new SMSnotificationService("+91729479272");

        emailService.sendNotifications("Hello, this is an email notification");
        smsService.sendNotifications("Hello, this is an SMS notification");

        emailService.subscribeToTopic("News");
        smsService.subscribeToTopic("Alerts");
    }

}
