package UI;
import java.util.Scanner;
import static Controller.Admin.reAdmin.reAdmins;
import static UI.UIAdminMenu.adminMenu;
import static UI.UIMenu.showMenu;
public class UIRegisterAdmin {
    public static void registerAdmin(){
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
                case 1:
                    reAdmins(name,lastName,nickname,password);
                    showMenu();
                    break;
                case 2:
                    registerAdmin();
                    break;
                case 3:
                    adminMenu();
                    break;
                default:
                    System.out.println("Number error");
                    break;
            }
        }while(response != 0);
    }
}
