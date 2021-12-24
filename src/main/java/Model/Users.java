package Model;
import lombok.Getter;
import lombok.Setter;
import java.util.HashMap;
import java.util.Map;
@Getter @Setter
public class Users {
    public static Map<Integer, User> userList = new HashMap<Integer, User>();
}
