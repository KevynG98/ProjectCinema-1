package Controller.Movie;
import Model.AdminModel.Admin;
import Model.MovieModel.Movie;
import Utils.Files.FileManage;
import Utils.Interfaces.ICrud;
import java.util.Map;

import static Model.AdminModel.Admins.adminList;
import static Model.MovieModel.Movies.movieList;

public class CrudMovie implements ICrud {

    Movie movie;
    FileManage file;

    public CrudMovie(){
        file = new FileManage("Movies");
    }

    public Movie getMovie() {
        return movie;
    }
    public void setMovie(String title,String premiere,int price){
            this.movie = new Movie((movieList.isEmpty())?1:movieList.size()+1,title,premiere, price);
    }

    @Override
    public void read() {
        try {
            this.file.setInput();
            movieList  = (Map<String, Movie>) this.file.getInput() ;
            this.file.closeInputStream();
        } catch (Exception e) {
            if(e.getMessage() != null)
                System.err.println(e.getMessage());
        }
    }

    @Override
    public void write() {
        try {
            movieList.put(movie.getTitle(),getMovie());
            this.file.OutputStreamProcess(movieList);
            this.file.closeOutputStream();
        } catch (Exception e) {
            if(e.getMessage() != null)
                System.err.println(e.getMessage());
        }
    }
}
