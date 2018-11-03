package lk.zeon.carrental.service.impl;

import lk.zeon.carrental.dto.AdminDto;
import lk.zeon.carrental.dto.CustomerDto;
import lk.zeon.carrental.dto.rentDto;
import lk.zeon.carrental.entity.Admin;
import lk.zeon.carrental.entity.Customer;
import lk.zeon.carrental.entity.Rent;
import lk.zeon.carrental.repository.CustomerRepository;
import lk.zeon.carrental.repository.RenttRepositroy;
import lk.zeon.carrental.service.RentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Ze on 10/31/2018.
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS , readOnly = true)
public class RentServiceImpl implements RentService {

    @Autowired
    private RenttRepositroy renttRepositroy;

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean addRent(rentDto rentdto) {

        Customer customer=new Customer(
               rentdto.getCustomer().getCid(),
               rentdto.getCustomer().getFullName(),
                rentdto.getCustomer().getNic(),
                rentdto.getCustomer().getNationality(),
                rentdto.getCustomer().getCountry(),
                rentdto.getCustomer().getCity(),
                rentdto.getCustomer().getMobile()

        );


        Admin admin=new Admin();
        admin.setAdminId(rentdto.getAdmin().getAdminId());


        Rent rent=new Rent(   );
        rent.setRentId(rentdto.getRentId());
        rent.setRentDate(rentdto.getRentDate());
        rent.setReturnDate(rentdto.getReturnDate());
        rent.setFuelProvidedBy(rentdto.getFuelProvidedBy());
        rent.setDownPayment(rentdto.getDownPayment());
        rent.setFuelCharj(rentdto.getFuelCharj());
        rent.setPlateNumber(rentdto.getPlateNumber());
        rent.setTotalPaid(rentdto.getTotalPaid());
        rent.setRentFee(rentdto.getRentFee());
        rent.setRentHour(rentdto.getRentHour());
        rent.setCustomer(customer);
        rent.setAdmin(admin);

        customerRepository.save(customer);
        renttRepositroy.save(rent);
return true;

    }

    @Override
    public rentDto updateRentDetal(rentDto dto) {
        return null;
    }

    @Override
    public rentDto searchvehicle(String rentDate, String returnDate, String plateNumber) {
        return null;
    }

    @Override
    public rentDto updateAdminConfirm(int adminId) {
        return null;
    }
}
