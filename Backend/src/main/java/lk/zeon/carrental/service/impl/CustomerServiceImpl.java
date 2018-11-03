package lk.zeon.carrental.service.impl;

import lk.zeon.carrental.dto.CustomerDto;
import lk.zeon.carrental.entity.Customer;
import lk.zeon.carrental.repository.CustomerRepository;
import lk.zeon.carrental.service.CarService;
import lk.zeon.carrental.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Ze on 10/31/2018.
 */
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public boolean addCustomerDetail(CustomerDto customerDto) {
        Customer customer=new Customer(
                customerDto.getCid(),
                customerDto.getFullName(),
                customerDto.getNic(),
                customerDto.getNationality(),
                customerDto.getCountry(),
                customerDto.getCity(),
                customerDto.getMobile()
        );
        customerRepository.save(customer);
        return true;
    }

    @Override
    public boolean deleteCustomerDetail(CustomerDto customerDto) {
        return false;
    }

    @Override
    public CustomerDto updateCustomerDetail(CustomerDto customerDto) {
        return null;
    }

    @Override
    public CustomerDto searchCustomerByIDNo(String idNo) {
        return null;
    }
}
