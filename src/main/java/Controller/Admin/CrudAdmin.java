package Controller.Admin;

import Model.AdminModel.Admin;
import Utils.Files.FileManage;
import Utils.Interfaces.ICrud;
import java.util.Map;

import static Model.AdminModel.Admins.adminList;

public class CrudAdmin implements ICrud {

    FileManage file;
    Admin admin;

    public CrudAdmin(){
        this.file = new FileManage("Admin");
    }

    public void setAdmin(String name, String lastName, String nickname, String password) {
        this.admin = new Admin((adminList.isEmpty())?1:adminList.size() + 1, name, lastName, nickname, password);
    }

    public Admin getAdmin(){
        return this.admin;
    }
    @Override
    public void read() {
        try {
            this.file.setInput();
            adminList  = (Map<String, Admin>) this.file.getInput() ;
            this.file.closeInputStream();
        } catch (Exception e) {
            if(e.getMessage() != null)
                System.err.println(e.getMessage());
        }
    }
    @Override
    public void write() {
        try {
            adminList.put(admin.getNickname(), getAdmin());
            file.OutputStreamProcess(adminList);
        } catch (Exception e) {
            if(e.getMessage() != null)
                System.err.println(e.getMessage());
        }
    }

}
