package Model.AdminModel;

import Model.UserDetails;

public class Admin extends UserDetails {

    public Admin(long id, String name, String lastName, String nickname, String password )
    {
        super(id, name, lastName, nickname, password);
    }
}
