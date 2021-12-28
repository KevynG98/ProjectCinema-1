package UI;
import java.util.Scanner;
import static Controller.showUser.showUsers;
import static UI.UIAuthUser.authUser;
import static UI.UIResgisterUser.registerUser;

public class UIMenu {
public static void showMenu(){
    System.out.println("Welcome to menu");
    int response = 0 ;
    do {
        System.out.println("Choose a options");
        System.out.println("1.Login");
        System.out.println("3.Register User");
        System.out.println("4.Show users");
        System.out.println("0.Exit");
        Scanner sc = new Scanner(System.in);
        response = Integer.parseInt(sc.nextLine());
        switch (response) {
            case 1:
                System.out.println("Admin");
                response = 0;
                authUser(1);
                break;
            case 2:
                response = 0;
                authUser(2);
                break;
            case 3:
                registerUser();
                break;
            case 4:
                showUsers();
                showMenu();
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



