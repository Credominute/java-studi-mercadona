package fr.studi.promoweb.ws;

import fr.studi.promoweb.pojo.Admin;
import fr.studi.promoweb.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(ApiRegistration.API_REST
        +ApiRegistration.ADMIN)
@RestController
public class AdminWs {

    @Autowired
    private AdminService adminService;

    @GetMapping
    public List<Admin> getAllAdmin(){
        return adminService.getAllAdmin();
    }

    @GetMapping("{id}")
    public Admin getAdminById(@PathVariable("id") Long id){
        return adminService.getAdminById(id);
    }

    @PostMapping
    public void createAdmin(@RequestBody Admin admin){

    }

    @PutMapping("{id}")
    public void updateAdminById(@RequestBody Admin admin,
                                @PathVariable Long id){

    }

    @DeleteMapping("{id}")
    public void deleteAdminById(@PathVariable Long id){

    }

}
