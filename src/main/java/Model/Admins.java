package Model;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Getter @Setter
public class Admins {
    private static Map<Integer, Admin> adminList = new HashMap<Integer, Admin>();
}
