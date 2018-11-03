package lk.zeon.carrental.service.impl;

import lk.zeon.carrental.dto.AdminDto;
import lk.zeon.carrental.entity.Admin;
import lk.zeon.carrental.repository.AdminRepository;
import lk.zeon.carrental.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ze on 10/31/2018.
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS , readOnly = true)
public class AdminServiceImpl implements AdminService {

    @Autowired
    AdminRepository adminRepository;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Boolean addNewAdmin(AdminDto admin) {
        Admin admin1=new Admin();
        admin1.setAdminId(admin.getAdminId());
        admin1.setFullName(admin.getFullName());
        admin1.setUserName(admin.getUserName());
        admin1.setPassword(admin.getPassword());
        admin1.setAddress(admin.getAddress());
        admin1.setMobile(admin.getMobile()
        );
        adminRepository.save(admin1);
        return true;
    }

    @Override
    public boolean getAdminDetail(String password, String username) {

        boolean existUser= adminRepository.existsById(username);
        if (!existUser){
            return false;
        }

        Admin admin=adminRepository.findById(username).get();
       return admin.getPassword().equals(password);

    }

    @Override
    public AdminDto updateAdminDetail(AdminDto adminDto) {
        return null;
    }

    @Override
    public ArrayList<AdminDto> getAdmins() {
        List<Admin>admins=adminRepository.findAll();
        ArrayList<AdminDto> alAdmins=new ArrayList<>();
        for (Admin  admin:admins ) {
            AdminDto  adminDto=new AdminDto(
                    admin.getAdminId(),
                    admin.getPassword(),
                    admin.getUserName(),
                    admin.getFullName(),
                    admin.getAddress(),
                    admin.getMobile()
            );
            alAdmins.add(adminDto);

        }
        return alAdmins;

    }
}
