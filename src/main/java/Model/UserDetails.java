package Model;

        import lombok.AllArgsConstructor;
        import lombok.Getter;
        import lombok.Setter;

        import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
public abstract class UserDetails implements Serializable {

    private long id;
    private String name;
    private String lastName;
    private String nickname;
    private String password;


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", Name='" + getName() + '\'' +
                ", LastName='" + getLastName() + '\'' +
                ", Nickname='" + getNickname() + '\'' +
                ", Password='" + getPassword() + '\'' +
                '}';
    }
}
