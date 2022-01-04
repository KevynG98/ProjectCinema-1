package Reports;


import java.io.*;

import static Controller.Movie.CrudMovie.readMovie;
import static Model.Movies.movieList;

public class Report {

    void ticketSold(String title, int price, int numTickets){
        readMovie();
        int sold = 0;
        if (movieList.containsKey(title)) {
            sold += numTickets;
        }
        int total = sold * numTickets;
    }

    //Escribe en el archvio Report.txt
    public static void writerReport(){
        File file = new File("Data/Report.txt");
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write("aaaaaaaa");
            writer.newLine();
            writer.write("aaaaaaaa");
            writer.flush();
        }catch(Exception e){

        }
    }

    //Lee el archivo report.txt
    public static void readReport(){
        File file = new File("Data/Report.txt");
        try{
            BufferedReader reader = new BufferedReader(new FileReader(file));
           String linea = reader.readLine();
           while(linea != null){
               System.out.println(linea);
               linea = reader.readLine();
           }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

}