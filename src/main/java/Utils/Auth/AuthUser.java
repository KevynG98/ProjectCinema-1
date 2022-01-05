package Utils.Auth;

import lombok.AllArgsConstructor;

import static Model.AdminModel.Admins.adminList;
import static Model.UserModel.Users.userList;
import static UI.AdminOptions.UIAdminMenu.adminMenu;
import static UI.UserOptions.UIUserMenu.userMenu;

@AllArgsConstructor

public class AuthUser {

    String nickName;
    String passWord;

    public boolean userLogin() throws Exception {

        if (adminList.containsKey(nickName)) {

            if (adminList.get(nickName).getPassword().equals(passWord)) {
                UserLogged.assignAdmin(nickName);
                adminMenu();
                return true;
            } else {
                System.out.println("Invalid User or Password");
                return false;
            }


        } else if (userList.containsKey(nickName)) {
            if (userList.get(nickName).getPassword().equals(passWord)) {
                UserLogged.assignUser(nickName);
                userMenu();
                return true;
            } else {
                System.out.println("Invalid User or Password");
                return false;
            }
        } else {
            System.out.println("User not valid");
            return false;
        }

    }
}
