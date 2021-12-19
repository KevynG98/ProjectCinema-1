package Model;

        import lombok.AllArgsConstructor;
        import lombok.Getter;
        import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public abstract class UserDetails {

    private long id;
    private String name;
    private String lastName;
    private String nickname;
    private String password;

}
