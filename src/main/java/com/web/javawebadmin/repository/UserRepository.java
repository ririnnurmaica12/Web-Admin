package com.web.javawebadmin.repository;

import com.web.javawebadmin.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User, Integer> {
    @Query(value = "SELECT * from users where username = :username",
            nativeQuery = true)
    User findUserByName(@Param("username") String username);

}

