package com.vamsi.myLogin.dao;

import com.vamsi.myLogin.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query(value = "select U from User U where U.email=?1")
    User findByEmail(String email);

}
