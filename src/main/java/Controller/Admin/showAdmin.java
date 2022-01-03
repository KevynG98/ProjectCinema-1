package Controller.Admin;
import Model.Admin;
import java.util.Map;
import java.util.Scanner;
import static Controller.Admin.CrudAdmin.readAdmin;
import static Model.Admins.adminList;
import static UI.UIAdminMenu.adminMenu;

public class showAdmin {
    public static void showAdmins(){
        try{
            //Recupera todos los usuarios admin existentes
            readAdmin();
            //Recorre los usuarios admin existentes
            for (Map.Entry<String, Admin> data: adminList.entrySet()) {
                System.out.println(data.getValue());
            }
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        int response;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("1.Back");
            response = Integer.parseInt(sc.nextLine());
            if (response == 1) {
                adminMenu();
            } else {
                System.out.println("Error");
            }
        }while(response!=0);
    }
}
