package UI;
import java.util.Scanner;
import static Controller.User.reUser.reUsers;
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
            System.out.println("1.Confirm");
            System.out.println("2.back");
            System.out.println("3.exit");
            response = Integer.parseInt(sc.nextLine());
            switch (response){
                case 1 ->{
                    reUsers(name,lastName,nickname,password);
                    response = 0;
                }
                case 2 -> registerUser();
                case 3 -> response = 0;
                default -> System.out.println("Option invalid");
            }
        }while(response != 0);
    }
}
