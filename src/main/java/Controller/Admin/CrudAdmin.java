package Controller.Admin;
import Model.Admin;
import java.io.*;
import java.util.Map;
import static Model.Admins.adminList;

public class CrudAdmin {
    public static void readAdmin() {
        try {
            File file = new File("Data/Admin.txt");
            //Recupera usuarios actuales y add nuevos
            ObjectInputStream recoveryData = new ObjectInputStream(new FileInputStream(file));
            adminList  = (Map<String, Admin>) recoveryData.readObject();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    public static void writeNewAdmin(String name, String lastName, String nickname, String password) {
        try {
            File file = new File("Data/Admin.txt");
            adminList.put(nickname, new Admin(adminList.size() + 1, name, lastName, nickname, password));
            ObjectOutputStream writeData = new ObjectOutputStream(new FileOutputStream(file));
            writeData.writeObject(adminList);
            writeData.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    public static void writeAdmin(String name, String lastName, String nickname, String password) {
        try {
            File file = new File("Data/Admin.txt");
            adminList.put(nickname, new Admin(1, name, lastName, nickname, password));
            ObjectOutputStream writeData = new ObjectOutputStream(new FileOutputStream(file));
            writeData.writeObject(adminList);
            writeData.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
