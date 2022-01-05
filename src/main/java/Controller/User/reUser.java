package Controller.User;

import java.util.Scanner;

import static Controller.User.CrudUser.*;
import static Model.UserModel.Users.userList;
import static UI.UIResgisterUser.registerUser;

public class reUser{

    public static void reUsers(String name,String lastName,String nickname,String password){
        Scanner sc = new Scanner(System.in);
        try{
                //Recupera usuarios actuales y add nuevos
            CrudUser user = new CrudUser();
            user.read();
                //Registra nuevos usuarios
                if(userList.containsKey(nickname)){
                    System.out.println("this name is not available");
                    System.out.println("please write an available nickname");
                    sc.nextLine();
                    registerUser();
                }else{
                    user.setUser(name,lastName,nickname,password);
                    user.write();
                }
    } catch(Exception e){
        System.err.println(e.getMessage());
     }
    }
}
