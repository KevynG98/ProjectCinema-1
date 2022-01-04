package UI;

import java.util.Scanner;

public class UITicketMenu {

    public void UIBuyTicket() {
        int response;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter movie Title");
        String movieTitle = sc.nextLine();
        System.out.println("Enter date of the movie");
        String date = sc.nextLine();
        System.out.println("Show room");
        //print matrix
        System.out.println("Number of seats");
        int seats = sc.nextInt();
        System.out.println("The price is: ");
        
        //
        System.out.println("1.Confirm");
        System.out.println("2.back");
        System.out.println("3.exit");
        response = Integer.parseInt(sc.nextLine());
        switch (response) {
            case 1:
                System.out.println();
                break;
            case 2:
                System.out.println();
                break;
            case 3:
                System.out.println();

        }
    }
}
