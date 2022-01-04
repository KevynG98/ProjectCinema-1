package Controller.User;
import Model.User;
import java.util.Map;
import java.util.Scanner;
import static Controller.User.CrudUser.readUser;
import static Model.Users.userList;


public class showUser {
    public static void showUsers(){
        try{
            //Recupera todos los usuarios existentes
             readUser();
             //Recorre los usarios existentes
            for (Map.Entry<String,User> data: userList.entrySet()) {
                System.out.println(data.getValue());
            }
           } catch(Exception e){
            System.out.println(e.getMessage());
          }
        Scanner sc = new Scanner(System.in);
        sc.nextLine();

    }
}
