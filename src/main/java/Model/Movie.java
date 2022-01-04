package Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor

public class Movie implements Serializable {
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
                '}';
    }
}
