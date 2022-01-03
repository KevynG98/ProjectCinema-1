package Utils.Auth;

import static Model.Admins.adminList;
import static Model.Users.userList;
import static UI.UIAdminMenu.adminMenu;
import static UI.UIUserMenu.userMenu;


public class AuthUser {

    String nickName;
    String passWord;

    public AuthUser(String nickName, String passWord) {
        this.nickName = nickName;
        this.passWord = passWord;
    }

    public boolean userLogin() {

        if (adminList.containsKey(nickName)) {

            if (adminList.get(nickName).getPassword().equals(passWord)) {
                UserLogged.assignAdmin(nickName);
                adminMenu();
                return true;
            } else {
                System.out.println("Password doesn't match");
                return false;
            }


        } else if (userList.containsKey(nickName)) {
            if (userList.get(nickName).getPassword().equals(passWord)) {
                UserLogged.assignUser(nickName);
                userMenu();
                return true;
            } else {
                System.out.println("Password doesn't match");
                return false;
            }
        } else {
            System.out.println("User not valid");
            return false;
        }

    }
}
