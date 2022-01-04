package Utils.Mailing;

import java.util.Properties;


public class MailSender {
    // Envia reporte al admin,
    public static  void sendMail(String receiver){
        Properties properties = new Properties();

        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");

        String myAccountEmail = "emanuelprisker@gmail.com";
        String password = "Librosimvarrote1";



    }
}
