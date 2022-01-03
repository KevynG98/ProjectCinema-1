package UI;
import Model.Admin;
import Model.User;
import java.util.Scanner;
import static Controller.Admin.CrudAdmin.readAdmin;
import static Controller.User.CrudUser.readUser;
import static Model.Admins.adminList;
import static Model.Users.userList;
import static UI.UIAdminMenu.adminMenu;
import static UI.UIUserMenu.userMenu;

public class UIAuthUser {

public static void authUserC(){

    authUser loginSys;
    boolean userCorrect;
    Scanner sc = new Scanner(System.in);

    do {
        System.out.println("Insert your nickname");
        String nickname = sc.nextLine();
        System.out.println("Insert your password");
        String password = sc.nextLine();

        readAdmin();
        readUser();

        loginSys = new authUser(nickname,password);

        userCorrect = loginSys.userLogin();

    }while(!userCorrect);
}
}


class authUser{

    String nickName;
    String passWord;

    authUser(String nickName, String passWord){
        this.nickName=nickName;
        this.passWord=passWord;
    }

    boolean userLogin(){

        if(adminList.containsKey(nickName)){

            if(adminList.get(nickName).getPassword().equals(passWord)){
                userLogged.assignAdmin(nickName);
                adminMenu();
                return true;
            }else{
                System.out.println("Password doesn't match");
                return false;
            }


        }else if(userList.containsKey(nickName)){
            if(userList.get(nickName).getPassword().equals(passWord)){
                userLogged.assignUser(nickName);
                userMenu();
                return true;
            }else{
                System.out.println("Password doesn't match");
                return false;
            }
        }else{
            System.out.println("User not valid");
            return false;
        }

    }
}

class userLogged{
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
