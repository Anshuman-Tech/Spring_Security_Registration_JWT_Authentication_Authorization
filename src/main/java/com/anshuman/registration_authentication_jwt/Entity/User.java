package com.anshuman.registration_authentication_jwt.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "username")
    private Long userId;

    @Column(nullable = false)
    private String firstName;
    private String lastname;

    @Column(unique = true)
    private String emailId;
    private String password;
    private String phone;

}
