package Model;
import lombok.Getter;
import lombok.Setter;
import java.util.HashMap;
import java.util.Map;

@Getter @Setter
public class Admins {
    public static Map<String, Admin> adminList = new HashMap<String, Admin>();
}
