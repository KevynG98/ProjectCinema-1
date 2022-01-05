package Model.UserModel;
import Model.UserDetails;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter @Setter
public class User extends UserDetails {

    private static final long serialVersionUID = 1L;
    public User(long id, String name, String lastName, String nickname, String password )
    {
    super(id, name, lastName, nickname, password);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
