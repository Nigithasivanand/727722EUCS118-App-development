package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Modal.LoginModal;

@Repository
public interface LoginRepo extends JpaRepository<LoginModal,Integer> {
    LoginModal findByUsernameAndPassword(String username, String password);
}
