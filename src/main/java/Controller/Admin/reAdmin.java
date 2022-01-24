package Controller.Admin;
import Model.AdminModel.Admin;
import Model.UserDetails;

import java.util.Scanner;
import static Controller.Admin.CrudAdmin.*;
import static Model.AdminModel.Admins.adminList;
import static UI.AdminOptions.UIRegisterAdmin.registerAdmin;

public class reAdmin {
    public static void reAdmins(UserDetails admin){
        Scanner sc = new Scanner(System.in);
        try{
            //Recupera usuarios actuales y add nuevos

            CrudAdmin cAdmin = new CrudAdmin();
            cAdmin.read();
                //Registra nuevos usuarios admin
                if(adminList.containsKey(admin.getNickname())){
                    System.out.println("this name is not available");
                    System.out.println("please write an available nickname");
                    sc.nextLine();
                    registerAdmin();
                }else{
                    cAdmin.setAdmin(admin);
                    cAdmin.write();
                }

        } catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
}
