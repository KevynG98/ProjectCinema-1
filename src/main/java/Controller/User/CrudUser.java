package Controller.User;

import Model.AdminModel.Admin;
import Model.UserModel.User;
import Utils.Files.FileManage;
import Utils.Interfaces.ICrud;

import java.io.*;
import java.util.Map;

import static Model.AdminModel.Admins.adminList;
import static Model.UserModel.Users.userList;

public class CrudUser implements ICrud {
    FileManage a;
    User user;

    public CrudUser(){
        this.a = new FileManage("Data");
    }
    public void setUser(String name, String lastName, String nickname, String password) {
        this.user = new User((userList.isEmpty())?1:userList.size() + 1, name, lastName, nickname, password);
    }
    public User getUser(){
        return this.user;
    }
    @Override
    public void read() {
        try {
            this.a.setInput();
            userList  = (Map<String, User>) this.a.getInput() ;
            this.a.closeInputStream();
        } catch (Exception e) {
            if(e.getMessage() != null)
                System.err.println(e.getMessage());
        }
    }

    @Override
    public void write() {
        try {
            userList.put(user.getNickname(), getUser());
            a.OutputStreamProcess(userList);
        } catch (Exception e) {
            if(e.getMessage() != null)
                System.err.println(e.getMessage());
        }
    }

}


