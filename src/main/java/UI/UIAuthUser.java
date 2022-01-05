package UI;
import Controller.Admin.CrudAdmin;
import Controller.User.CrudUser;
import Utils.Auth.AuthUser;
import java.util.Scanner;

public class UIAuthUser {

public static void authUserC() throws Exception {

    AuthUser loginSys;
    boolean userCorrect;
    Scanner sc = new Scanner(System.in);
    CrudAdmin a = new CrudAdmin();
    CrudUser u = new CrudUser();

    do {
        System.out.println("Insert your nickname");
        String nickname = sc.nextLine();
        System.out.println("Insert your password");
        String password = sc.nextLine();

        a.read();
        u.read();

        loginSys = new AuthUser(nickname,password);

        userCorrect = loginSys.userLogin();

    }while(!userCorrect);
    }
}

