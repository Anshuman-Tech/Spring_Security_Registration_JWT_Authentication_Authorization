package com.anshuman.registration_authentication_jwt.DAO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserDAO {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phone;
}
