package UI;

import java.util.Scanner;

public class UIMenu {

public static void ShowMenu(){
    System.out.println("Welcome to menu");
    int response = 0 ;
    do {
        System.out.println("Choose a options");
        System.out.println("1.Admin");
        System.out.println("2.User");
        System.out.println("0.Exit");

        Scanner sc = new Scanner(System.in);
        response = Integer.parseInt(sc.nextLine());

        switch (response) {
            case 1:
                System.out.println("Admin");
                response = 0;
                // authUser(1);
                break;
            case 2:
                response = 0;
                //  authUser(2);
                //  showPatientMenu();
                break;
            case 0:
                System.out.println("Thank for visit");
                break;

            default:
                System.out.println("Option error");
        }

    } while (response != 0) ;

   }
}



