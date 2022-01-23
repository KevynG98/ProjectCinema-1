package Controller.Admin;
import java.util.Scanner;
import static Controller.Admin.CrudAdmin.*;
import static Model.AdminModel.Admins.adminList;
import static UI.AdminOptions.UIRegisterAdmin.registerAdmin;

public class reAdmin {
    public static void reAdmins(String name,String lastName,String nickname,String password){
        Scanner sc = new Scanner(System.in);
        try{
            //Recupera usuarios actuales y add nuevos

            CrudAdmin admin = new CrudAdmin();
            admin.read();
                //Registra nuevos usuarios admin
                if(adminList.containsKey(nickname)){
                    System.out.println("this name is not available");
                    System.out.println("please write an available nickname");
                    sc.nextLine();
                    registerAdmin();
                }else{
                    admin.setAdmin(name,lastName,nickname,password);
                    admin.write();
                }

        } catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
}
