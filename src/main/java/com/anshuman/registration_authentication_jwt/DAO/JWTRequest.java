package com.anshuman.registration_authentication_jwt.DAO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class JWTRequest {

    private String userName;
    private String password;
}
