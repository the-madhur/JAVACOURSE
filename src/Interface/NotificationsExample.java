package Interface;

public class NotificationsExample 
{
    public static void main(String[] args) 
    {
        NotificationsService emailService = new EmailService("usermadhur@gmail.com");
        NotificationsService smsService = new SMSnotificationService("+91729479272");

        emailService.sendNotifiactions("Hello, this is an email notification");
        smsService.sendNotifiactions("Hello, this is an SMS notification");

        emailService.subscribeToTopic("News");
        smsService.subscribeToTopic("Alerts");
    }

}
