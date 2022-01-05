package Controller.Admin;
import Model.AdminModel.Admin;
import java.util.Map;
import java.util.Scanner;
import Controller.Admin.CrudAdmin;

import static Controller.Admin.CrudAdmin.readAdmin;
import static Model.AdminModel.Admins.adminList;

public class showAdmin{

    public static void showAdmins(){
        try{
            //Recupera todos los usuarios admin existentes
            CrudAdmin readAdmin = new CrudAdmin();
            readAdmin.read();
            //Recorre los usuarios admin existentes
            for (Map.Entry<String, Admin> data: adminList.entrySet()) {
                System.out.println(data.getValue());
            }
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
            Scanner sc = new Scanner(System.in);
            sc.nextLine();
    }
}
