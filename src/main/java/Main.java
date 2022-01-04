
import Model.room;

import java.util.Scanner;

import static UI.UIMenu.showMenu;

public class Main {
    public static void main(String[] args) {

        //showMenu();
        int sits[][]= new int[5][5];
        Scanner sc = new Scanner(System.in);
        room a = new room(1,"sala1","a",sits);

        a.init();
        a.print();

        System.out.println("ingrese una fila");
        String y = sc.nextLine();
        System.out.println("ingrese una columna");
        int x = Integer.parseInt(sc.nextLine());
        a.activateSit(y,x);
        a.print();

        /*


        roomOrder ro = new roomOrder();
        //ro.mainFunction();
         solo andaba probando lo de la fecha
        String timeStamp = new SimpleDateFormat("yyyy/MM/dd HH:mm").format(Calendar.getInstance().getTime());
        System.out.println(timeStamp); */
    }
}
