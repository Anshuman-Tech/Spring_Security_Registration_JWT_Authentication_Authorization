package com.anshuman.registration_authentication_jwt.Service;

import com.anshuman.registration_authentication_jwt.DAO.UserDAO;
import com.anshuman.registration_authentication_jwt.Entity.User;
import com.anshuman.registration_authentication_jwt.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;
    @Override
    public User registerUser(UserDAO userDAO){
        User user = new User();
        user.setFirstName(userDAO.getFirstName());
        user.setLastname(userDAO.getLastName());
        user.setEmailId(userDAO.getEmail());
        user.setPassword(passwordEncoder.encode(userDAO.getPassword()));
        user.setPhone(userDAO.getPhone());

        return userRepository.save(user);
    }
}
