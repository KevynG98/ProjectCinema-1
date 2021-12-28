package UI;

import java.util.Scanner;

import static Controller.showUser.showUsers;
import static UI.UIAuthUser.authUser;
import static UI.UIResgisterUser.registerUser;

public class UIMenu {
public static void showMenu() {
    System.out.println("Welcome to the Menu");
    int response;
    do {

        System.out.println("Choose an Option");
        System.out.println("1.Admin");
        System.out.println("2.User");
        System.out.println("3.Register User");
        System.out.println("4.Show Users");
        System.out.println("0.Exit");
        Scanner sc = new Scanner(System.in);
        response = Integer.parseInt(sc.nextLine());
        switch (response) {
            case 1 -> {
                System.out.println("Admin");
                response = 0;
                authUser(1);
            }
            case 2 -> {
                response = 0;
                authUser(2);
            }
            case 3 -> registerUser();
            case 4 -> {
                showUsers();
                showMenu();
            }
            case 0 -> System.out.println("Thank you for your Visit");
            default -> System.out.println("Invalid Option");
        }
    } while (0 != response);
   }
}



