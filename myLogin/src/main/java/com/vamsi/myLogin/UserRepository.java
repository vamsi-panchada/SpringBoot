package com.vamsi.myLogin;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query(value = "select U from User U where U.email=?1")
    User findByEmail(String email);

}
