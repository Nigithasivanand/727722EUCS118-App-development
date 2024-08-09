package com.example.demo.Service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.Modal.AdminModel;
import com.example.demo.Repository.AdminRepository;

@Service
public class AdminService {

    private final AdminRepository adminRepository;

    public AdminService(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    public List<AdminModel> getAllAdmins() {
        return adminRepository.findAll();
    }

    public AdminModel createAdmin(@RequestBody AdminModel admin) {
        adminRepository.save(admin);
        return admin;
    }

    public AdminModel getAdminById(Integer id) {
        return adminRepository.findById(id).orElse(null);
    }

    public String deleteAdmin(Integer id) {
        adminRepository.deleteById(id);
        return "Deleted successfully";
    }

    public String updateAdmin(AdminModel admin, Integer id) {
        admin.setId(id);
        adminRepository.save(admin);
        return "Updated successfully";
    }
}
