package Utils.Mailing;

import Model.TicketModel.Ticket;

import java.util.Scanner;

public class Mail {
    public static void SendTicketTo(Ticket ticket)throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Mail to send the Ticket");
        String Mail = sc.nextLine();
        StringBuilder bodyText = new StringBuilder();

        bodyText.append("Movie Title: "+ticket.getMovieTitle().toUpperCase() +"\n");
        bodyText.append("Premier Date: "+ ticket.getDate()+"\n");
        bodyText.append("Price: "+ ticket.getPrice()+"\n");
        bodyText.append("Seats Bought: "+ ticket.getSitsAmount()+"\n");
        bodyText.append("Seats Ubication: "+ticket.getSeat()+"\n");

        MailSender.sendMail(Mail,bodyText.toString());
    }
}