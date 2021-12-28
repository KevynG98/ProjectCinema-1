package Controller;

import Model.User;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Map;
import java.util.Scanner;

import static UI.UIMenu.showMenu;

public class showUser {
    public static void showUsers(){
        try{
            //Recupera todos los usuarios existentes
            File file = new File("Data/Data.txt");
            ObjectInputStream recoveryData = new ObjectInputStream(new FileInputStream(file));
            Map<Integer,User> userData = (Map<Integer, User>) recoveryData.readObject();
            recoveryData.close();
            for (Map.Entry<Integer,User> data: userData.entrySet()) {
                System.out.println(data.getValue());
            }
           } catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
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
