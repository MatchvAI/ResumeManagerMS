package com.resumeManagerMS.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.resumeManagerMS.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    
}
