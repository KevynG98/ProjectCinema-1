package Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;

@AllArgsConstructor
@Getter
@Setter
public class RoomMovie implements Serializable {
    String title;
    String room;
    @Override
    public String toString() {
        return "Movies{" +
                " Movie='" + getTitle() + '\'' +
                ", NameSala='" + getRoom() + '\'' +
                '}';
    }
}
