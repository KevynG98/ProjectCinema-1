package UI;
import java.util.Scanner;
import static Controller.reUser.reUsers;
import static UI.UIMenu.showMenu;

public class UIResgisterUser {
    public static void registerUser(){
        int response = 0;
        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("Write your name");
            String name = sc.nextLine();
            System.out.println("Write your lastName");
            String lastName = sc.nextLine();
            System.out.println("Write your nickname");
            String nickname = sc.nextLine();
            System.out.println("Write your password");
            String password = sc.nextLine();
            System.out.println("1.Confirmar");
            System.out.println("2.back");
            System.out.println("3.exit");
            response = Integer.parseInt(sc.nextLine());
            switch (response){
                case 1:
                    reUsers(name,lastName,nickname,password);
                    showMenu();
                    break;
                case 2:
                    registerUser();
                    break;
                case 3:
                    showMenu();
                    break;
                default:
                    System.out.println("Number error");
                    break;
            }
        }while(response != 0);
    }
}
