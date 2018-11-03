package lk.zeon.carrental.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Ze on 10/30/2018.
 */
@Entity
public class Admin {

    @Id

    private String adminId;

    private String password;
    private String userName;
    private String fullName;
    private String address;
    private String mobile;

    public Admin() {

    }

    public Admin(String password, String userName, String fullName, String address, String mobile) {
        this.password = password;
        this.userName = userName;
        this.fullName = fullName;
        this.address = address;
        this.mobile = mobile;
    }

    public Admin(String password, String userName) {
        this.password = password;
        this.userName = userName;
    }

    public Admin(String password) {
        this.password = password;
    }

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "adminId=" + adminId +
                ", password='" + password + '\'' +
                ", userName='" + userName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", address='" + address + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}
