package Utils.Auth;

import Model.AdminModel.Admin;
import Model.UserModel.User;
import static Model.AdminModel.Admins.adminList;
import static Model.UserModel.Users.userList;


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
