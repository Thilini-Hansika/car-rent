package lk.zeon.carrental.service;

import lk.zeon.carrental.dto.AdminDto;
import lk.zeon.carrental.entity.Admin;

import java.util.ArrayList;

/**
 * Created by Ze on 10/31/2018.
 */
public interface AdminService {
    public Boolean addNewAdmin(AdminDto admin);
    public boolean getAdminDetail(String password, String username);
    public AdminDto updateAdminDetail(AdminDto adminDto);
    public ArrayList<AdminDto> getAdmins();
//    public  AdminDto searchByPassword(String Password);


}
