package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Modal.LoginModal;
import com.example.demo.Repository.LoginRepo;

@Service
public class LoginService {
    @Autowired
    private LoginRepo loginrepo;

    public List<LoginModal>getAllUsers()
    {
      return loginrepo.findAll();
    }
    public LoginModal createUser(LoginModal user)
    {
      return loginrepo.save(user);
    }
    public LoginModal getUserByUsernameAndPassword(String username,String password)
    {
       return loginrepo.findByUsernameAndPassword(username, password);
    }
    
}
