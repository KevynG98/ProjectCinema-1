package Model;
import lombok.Getter;
import lombok.Setter;
import java.util.HashMap;
import java.util.Map;
@Getter @Setter
public class Users {

    public static Map<String, User> userList = new HashMap<String, User>();
}
