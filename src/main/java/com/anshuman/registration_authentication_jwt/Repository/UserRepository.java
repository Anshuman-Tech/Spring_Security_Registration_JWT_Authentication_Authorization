package com.anshuman.registration_authentication_jwt.Repository;

import com.anshuman.registration_authentication_jwt.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    User findByEmailId(String userName);
}
