package UI;
import java.util.Scanner;
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
        System.out.println("0.Exit");
        Scanner sc = new Scanner(System.in);
        response = Integer.parseInt(sc.nextLine());
        switch (response) {
            case 1 -> authUser(1);
            case 2 -> authUser(2);
            case 3 -> registerUser();
            case 0 -> System.out.println("Thank you for your Visit");
            default -> System.out.println("Invalid Option");
        }
    } while (0 != response);
   }
}



