package dev.kanishkaujjain.react.payloads;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserDAO {
    private int Id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;

}
