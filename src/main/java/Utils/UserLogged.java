package Utils;

import Model.Admin;
import Model.User;
import static Model.Admins.adminList;
import static Model.Users.userList;


public class UserLogged {
    //Guarda el usuario logueado
    public static User userLogged;
    public static Admin adminLogged;

    static void assignUser(String nickname){
        userLogged = userList.get(nickname);
    }

    static void assignAdmin(String nickname){
        adminLogged = adminList.get(nickname);
    }

}
