package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Modal.AdminModel;

@Repository
public interface AdminRepository extends JpaRepository<AdminModel, Integer>{
    
}
