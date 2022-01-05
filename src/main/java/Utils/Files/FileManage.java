package Utils.Files;

import java.io.*;

import static Model.AdminModel.Admins.adminList;

public class FileManage{

    ObjectInputStream input;
    ObjectOutputStream output;
    String fileName;

    public FileManage(String FileName){
        this.fileName = FileName;
    }

    public void setInput() throws IOException {
        File file = new File("Data/"+this.fileName+".txt");
        //Recupera usuarios actuales y add nuevos
        this.input = new ObjectInputStream(new FileInputStream(file));

    }
    public Object getInput() throws IOException, ClassNotFoundException {
        return this.input.readObject();
    }

    public void closeInputStream() throws IOException {
       this.input.close();
    }

    public void setOutput() throws IOException {
        File file = new File("Data/"+this.fileName+".txt");
        //Recupera usuarios actuales y add nuevos
        this.output = new ObjectOutputStream(new FileOutputStream(file));
    }
    public void closeOutputStream() throws IOException {
        this.output.close();
    }
    public void writeOutputStream(Object xd) throws IOException {
        this.output.writeObject(xd);
    }

    public void OutputStreamProcess(Object xd) throws IOException {
        setOutput();
        writeOutputStream(xd);
        closeOutputStream();
    }


}
