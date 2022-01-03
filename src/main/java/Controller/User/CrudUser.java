package Controller.User;

import Model.User;

import java.io.*;
import java.util.Map;
import static Model.Users.userList;

public class CrudUser {
    public static void readUser() {
        try {
            File file = new File("Data/Data.txt");
            //Recupera usuarios actuales y add nuevos
            ObjectInputStream recoveryData = new ObjectInputStream(new FileInputStream(file));
            userList = (Map<String, User>) recoveryData.readObject();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    public static void writeNewUser(String name, String lastName, String nickname, String password) {
        try {
            File file = new File("Data/Data.txt");
            userList.put(nickname, new User(userList.size() + 1, name, lastName, nickname, password));
            ObjectOutputStream writeData = new ObjectOutputStream(new FileOutputStream(file));
            writeData.writeObject(userList);
            writeData.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    public static void writeUser(String name, String lastName, String nickname, String password) {
        try {
            File file = new File("Data/Data.txt");
            userList.put(nickname, new User(1, name, lastName, nickname, password));
            ObjectOutputStream writeData = new ObjectOutputStream(new FileOutputStream(file));
            writeData.writeObject(userList);
            writeData.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}