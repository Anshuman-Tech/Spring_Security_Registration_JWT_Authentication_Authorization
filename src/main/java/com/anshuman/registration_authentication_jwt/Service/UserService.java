package com.anshuman.registration_authentication_jwt.Service;

import com.anshuman.registration_authentication_jwt.DAO.UserDAO;
import com.anshuman.registration_authentication_jwt.Entity.User;

public interface UserService {

    User registerUser(UserDAO userDAO);
}
