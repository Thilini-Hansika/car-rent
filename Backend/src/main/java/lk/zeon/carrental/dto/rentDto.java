package lk.zeon.carrental.dto;

import java.util.Date;

/**
 * Created by Ze on 10/31/2018.
 */
public class rentDto {

    private String rentId;

    private String plateNumber;
    private Date rentDate;
    private Date returnDate;
    private int rentHour;
    private int rentFee;
    private String fuelProvidedBy;
    private Double fuelCharj;
    private Double downPayment;
    private  Double totalPaid;
    private CustomerDto customer;
    private AdminDto admin;

    public rentDto() {

    }


    public rentDto( String plateNumber, Date rentDate, Date returnDate, int rentHour, int rentFee, String fuelProvidedBy, Double fuelCharj, Double downPayment, Double totalPaid, CustomerDto customer, AdminDto admin) {

        this.plateNumber = plateNumber;
        this.rentDate = rentDate;
        this.returnDate = returnDate;
        this.rentHour = rentHour;
        this.rentFee = rentFee;
        this.fuelProvidedBy = fuelProvidedBy;
        this.fuelCharj = fuelCharj;
        this.downPayment = downPayment;
        this.totalPaid = totalPaid;
        this.customer = customer;
        this.admin = admin;
    }

    public rentDto(String rentId, String plateNumber, Date rentDate, Date returnDate, int rentHour, int rentFee, String fuelProvidedBy, Double fuelCharj, Double downPayment, Double totalPaid, CustomerDto customer, AdminDto admin) {
        this.rentId = rentId;
        this.plateNumber = plateNumber;
        this.rentDate = rentDate;
        this.returnDate = returnDate;
        this.rentHour = rentHour;
        this.rentFee = rentFee;
        this.fuelProvidedBy = fuelProvidedBy;
        this.fuelCharj = fuelCharj;
        this.downPayment = downPayment;
        this.totalPaid = totalPaid;
        this.customer = customer;
        this.admin = admin;
    }

    public String getRentId() {
        return rentId;
    }

    public void setRentId(String rentId) {
        this.rentId = rentId;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public Date getRentDate() {
        return rentDate;
    }

    public void setRentDate(Date rentDate) {
        this.rentDate = rentDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public int getRentHour() {
        return rentHour;
    }

    public void setRentHour(int rentHour) {
        this.rentHour = rentHour;
    }

    public int getRentFee() {
        return rentFee;
    }

    public void setRentFee(int rentFee) {
        this.rentFee = rentFee;
    }

    public String getFuelProvidedBy() {
        return fuelProvidedBy;
    }

    public void setFuelProvidedBy(String fuelProvidedBy) {
        this.fuelProvidedBy = fuelProvidedBy;
    }

    public Double getFuelCharj() {
        return fuelCharj;
    }

    public void setFuelCharj(Double fuelCharj) {
        this.fuelCharj = fuelCharj;
    }

    public Double getDownPayment() {
        return downPayment;
    }

    public void setDownPayment(Double downPayment) {
        this.downPayment = downPayment;
    }

    public Double getTotalPaid() {
        return totalPaid;
    }

    public void setTotalPaid(Double totalPaid) {
        this.totalPaid = totalPaid;
    }

    public CustomerDto getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerDto customer) {
        this.customer = customer;
    }

    public AdminDto getAdmin() {
        return admin;
    }

    public void setAdmin(AdminDto admin) {
        this.admin = admin;
    }

    @Override
    public String toString() {
        return "rentDto{" + "rentId='" + rentId + '\'' + ", plateNumber='" + plateNumber + '\'' + ", rentDate=" + rentDate + ", returnDate=" + returnDate + ", rentHour=" + rentHour + ", rentFee=" + rentFee + ", fuelProvidedBy='" + fuelProvidedBy + '\'' + ", fuelCharj=" + fuelCharj + ", downPayment=" + downPayment + ", totalPaid=" + totalPaid + ", customer=" + customer + ", admin=" + admin + '}';
    }
}
