package Model;

        import lombok.Getter;
        import lombok.Setter;

@Getter
@Setter
public abstract class UserDetails {

    private String Name;
    private String LastName;
    private String Nickname;
    private String Password;
    private long Id;
}
