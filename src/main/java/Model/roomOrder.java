package Model;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class roomOrder {

    public JFileChooser selectFile(){
        JFileChooser file = new JFileChooser();
        JFileChooser finalFile = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Plain Text", "txt");
        file.setFileFilter(filter);
        int returnval = file.showOpenDialog(null);
        if (returnval == JFileChooser.APPROVE_OPTION){
            finalFile = file;
            //System.out.println(file.getSelectedFile().getName());
        } else{
            finalFile = null;
        }
        return finalFile;
    }

    public void readFile(JFileChooser file){
        try {
            File object = new File(file.getSelectedFile().getPath());
            Scanner reader = new Scanner(object);
            while (reader.hasNextLine()){
                String data = reader.nextLine();
                System.out.println(data);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error has ocurred");
            e.printStackTrace();
        }
    }



    public void mainFunction(){
        readFile(
                selectFile()
        );
    }
}
