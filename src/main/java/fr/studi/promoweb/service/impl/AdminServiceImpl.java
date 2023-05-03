package fr.studi.promoweb.service.impl;

import fr.studi.promoweb.pojo.Admin;
import fr.studi.promoweb.repository.AdminRepository;
import fr.studi.promoweb.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminRepository adminRepository;

    @Override
    public List<Admin> getAllAdmin(){
        return adminRepository.findAllAdmin();
    }

    @Override
    public Admin getAdminById(Long id){
        return adminRepository.findById(id).orElse(null);
    }
}
