package Controller.User;
import Model.UserModel.User;
import java.util.Map;
import java.util.Scanner;
import static Model.UserModel.Users.userList;


public class showUser {
    public static void showUsers(){
        try{
            //Recupera todos los usuarios existentes
            CrudUser user = new CrudUser();
             user.read();
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
