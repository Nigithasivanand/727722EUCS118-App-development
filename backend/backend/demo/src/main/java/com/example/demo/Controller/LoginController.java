package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Modal.LoginModal;
import com.example.demo.Service.LoginService;

@RestController
@RequestMapping("/users")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/signup")
    public LoginModal signup(@RequestBody LoginModal user) {
        return loginService.createUser(user);
    }

    @GetMapping("/login")
    public LoginModal login(@RequestParam String username, @RequestParam String password) {
        return loginService.getUserByUsernameAndPassword(username, password);
    }
}