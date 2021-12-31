package Controller.User;

import Model.User;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Map;
import java.util.Scanner;

import static Controller.User.CrudUser.readUser;
import static Model.Users.userList;
import static UI.UIMenu.showMenu;

public class showUser {
    public static void showUsers(){

        try{
            //Recupera todos los usuarios existentes
             readUser();
             //Recorre los usarios existentes
            for (Map.Entry<Integer,User> data: userList.entrySet()) {
                System.out.println(data.getValue());
            }
           } catch(Exception e){
            System.out.println(e.getMessage());
          }
        int response;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("1.Back");
            response = Integer.parseInt(sc.nextLine());
            if (response == 1) {
                showMenu();
            } else {
                System.out.println("Error");
            }
        }while(response!=0);
    }
}
