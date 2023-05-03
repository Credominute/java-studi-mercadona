    package fr.studi.promoweb.service;

    import fr.studi.promoweb.pojo.Admin;

    import java.util.List;

    public interface AdminService {
        List<Admin> getAllAdmin();

        Admin getAdminById(Long id);
    }
