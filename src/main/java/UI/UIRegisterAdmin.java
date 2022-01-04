package UI;
import java.util.Scanner;
import static Controller.Admin.reAdmin.reAdmins;
import static UI.UIAdminMenu.adminMenu;
import static UI.UIMenu.showMenu;
public class UIRegisterAdmin {
    public static void registerAdmin(){
        int response = 0;
        Scanner sc = new Scanner(System.in);
        do{
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
                    reAdmins(name,lastName,nickname,password);
                    response = 0;
                }
                case 2 -> response = 1;
                case 3 -> response = 0;
                default -> System.out.println("option invalid");

            }
        }while(response != 0);
    }
}
