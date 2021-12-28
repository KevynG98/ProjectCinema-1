package Controller;
import Model.User;
import java.io.*;
import java.util.HashMap;
import java.util.Map;
import static Model.Users.userList;

public class reUser {

    public static void reUsers(String name,String lastName,String nickname,String password){

        try{
            File file = new File("Data/Data.txt");
            Map<Integer, User> userListRecovery = new HashMap<Integer, User>();
            //Recupera usuarios actuales y add nuevos
            ObjectInputStream recoveryData = new ObjectInputStream(new FileInputStream(file));
            userListRecovery = (Map<Integer, User>) recoveryData.readObject();

            if(file.exists() && userListRecovery.size()>=1) {
                userListRecovery.put(userListRecovery.size()+1, new User(userListRecovery.size()+1,name,lastName,nickname,password));
                ObjectOutputStream writeData = new ObjectOutputStream(new FileOutputStream(file));
                writeData.writeObject(userListRecovery);
                writeData.close();
            }else if(file.exists() && userListRecovery==null){
                //Registra nuevos usuarios si no hay ninguno
                userList.put(1,new User(1,name,lastName,nickname,password));
                ObjectOutputStream writeData = new ObjectOutputStream(new FileOutputStream(file));
                writeData.writeObject(userList);
                writeData.close();
            }
    } catch(Exception e){
        System.err.println(e.getMessage());
     }
    }
}
