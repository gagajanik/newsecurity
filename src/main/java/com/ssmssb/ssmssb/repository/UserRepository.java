package com.ssmssb.ssmssb.repository;

import com.ssmssb.ssmssb.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<Users, Integer> {

    Optional<Users> findByUsername(String username);
}
