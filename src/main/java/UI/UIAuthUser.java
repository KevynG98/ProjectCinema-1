package UI;
import Model.Admin;
import Model.User;
import java.util.Map;
import java.util.Scanner;
import static Controller.Admin.CrudAdmin.readAdmin;
import static Controller.User.CrudUser.readUser;
import static Model.Admins.adminList;
import static Model.Users.userList;
import static UI.UIAdminMenu.adminMenu;
import static UI.UIUserMenu.userMenu;

public class UIAuthUser {
    //Guarda el usuario logueado
    public static User userLogged;
    public static Admin adminlogged;
public static void authUser(int userType){
    //usefType= 1 Admin
    //userType = 2 User
    boolean userCorrect = false;
    do {
        System.out.println("Insert your nickname");
        Scanner sc = new Scanner(System.in);
        String nickname = sc.nextLine();
        System.out.println("Insert your password");
        String password = sc.nextLine();
        if(userType == 1){
            readAdmin();
            for (Map.Entry<Integer, Admin> data: adminList.entrySet()) {
                if(data.getValue().getNickname().equals(nickname)){
                    userCorrect = true;
                    adminlogged = data.getValue();
                    adminMenu();
                }
            }
        }
        if(userType ==2){
            readUser();
            for (Map.Entry<Integer, User> data : userList.entrySet()) {
                if(data.getValue().getNickname().equals(nickname) && data.getValue().getPassword().equals(password)){
                    userCorrect = true;
                    //Obtener el usuario logueado
                    userLogged = data.getValue();
                  userMenu();
                }else{
                    System.out.println("User not valid");
                    sc.nextLine();
                }
            }
        }

    }while(!userCorrect);
}
}
