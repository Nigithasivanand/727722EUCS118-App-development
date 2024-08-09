package com.example.demo.Controller;

import java.util.List;
// import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Modal.AdminModel;
import com.example.demo.Service.AdminService;
import com.example.demo.Service.LoginService;

@RestController
@RequestMapping("/admin")
public class AdminController {
    private final AdminService adminService;

    public AdminController(AdminService adminService, LoginService loginService) {
        this.adminService = adminService;
        // this.loginService = loginService;
    }

    @GetMapping
    public List<AdminModel> getAllAdmins() {
        return adminService.getAllAdmins();
    }

    @GetMapping("/{id}")
    public AdminModel getAdminById(@PathVariable Integer id) {
        return adminService.getAdminById(id);
    }

    @PostMapping
    public AdminModel createAdmin(@RequestBody AdminModel admin) {
        return adminService.createAdmin(admin);
    }

    @PutMapping("/{id}")
    public String updateAdmin(@RequestBody AdminModel admin, @PathVariable Integer id) {
        return adminService.updateAdmin(admin, id);
    }

    @DeleteMapping("/{id}")
    public String deleteAdmin(@PathVariable Integer id) {
        return adminService.deleteAdmin(id);
    }

    // Methods for admin to manage users
    // @GetMapping("/user/{id}")
    // public Optional<LoginModal> getUserById(@PathVariable Integer id) {
    //     return loginService.getUserById(id);
    // }

    // @PutMapping("/user/{id}")
    // public LoginModal updateUser(@RequestBody LoginModal user, @PathVariable Integer id) {
    //     return loginService.updateUser(user, id);
    // }

    // @DeleteMapping("/user/{id}")
    // public String deleteUser(@PathVariable Integer id) {
    //     return loginService.deleteUser(id);
    // }
}