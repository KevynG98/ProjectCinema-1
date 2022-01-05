package Model.MovieModel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor

public class Movie implements Serializable {

    private static final long serialVersionUID = 2L;
    private long id;
    private String title;
    private String premiere;
    private int price;

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", Title='" + getTitle() + '\'' +
                ", Premiere='" + getPremiere() + '\'' +
                ", price='" + getPrice() + '\'' +
                '}';
    }
}
