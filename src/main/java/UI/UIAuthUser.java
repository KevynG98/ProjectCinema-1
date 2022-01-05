package UI;
import Controller.Admin.CrudAdmin;
import Utils.Auth.AuthUser;

import java.util.Scanner;
import static Controller.Admin.CrudAdmin.readAdmin;
import static Controller.User.CrudUser.readUser;

public class UIAuthUser {

public static void authUserC() throws Exception {

    AuthUser loginSys;
    boolean userCorrect;
    Scanner sc = new Scanner(System.in);
    CrudAdmin a = new CrudAdmin();

    do {
        System.out.println("Insert your nickname");
        String nickname = sc.nextLine();
        System.out.println("Insert your password");
        String password = sc.nextLine();

        a.read();
        readUser();

        loginSys = new AuthUser(nickname,password);

        userCorrect = loginSys.userLogin();

    }while(!userCorrect);
    }
}

