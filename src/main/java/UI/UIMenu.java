package UI;
import java.util.Scanner;
import static UI.UIAuthUser.authUserC;
import static UI.UIResgisterUser.registerUser;

public class UIMenu {
public static void showMenu() {
    System.out.println("Welcome to the Menu");
    int response;
    do {
        System.out.println("Choose an Option");
        System.out.println("1.Login");
        System.out.println("2.Register User");
        System.out.println("0.Exit");
        Scanner sc = new Scanner(System.in);
        response = Integer.parseInt(sc.nextLine());
        switch (response) {
            case 1 -> authUserC();
            case 2 -> registerUser();
            case 0 -> System.out.println("Thank you for your Visit");
            default -> System.out.println("Invalid Option");
        }
    } while (0 != response);
   }
}



