package lk.zeon.carrental.Controller;

import lk.zeon.carrental.dto.AdminDto;
import lk.zeon.carrental.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

/**
 * Created by Ze on 11/1/2018.
 */

@RestController
@CrossOrigin
@RequestMapping(value = "api/v1/admin")
public class AdminController {

    @Autowired
  private    AdminService adminService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE ,produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean saveAdmin(@RequestBody AdminDto adminDto){
        System.out.println("AdminDto"+adminDto);
        return adminService.addNewAdmin(adminDto);

    }
    @GetMapping (value = "/get",produces = MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<AdminDto> getAllAdmins(){
        return adminService.getAdmins();
    }

    @PostMapping(value="/login", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean canAuthenticate(@RequestBody AdminDto user){
        return adminService.getAdminDetail(user.getUserName(), user.getPassword());

    }
}
