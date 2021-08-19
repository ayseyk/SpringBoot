package com.StajOkulu.demo.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void saveCustomer(Customer customer){
        this.customerRepository.save(customer);
    }

    public void deleteCustomerById(Integer id) {
        this.customerRepository.deleteById(id);
    }

    public Customer getCustomerById(Integer id) {
        Optional<Customer> customerOptional = this.customerRepository.findById(id);
        return customerOptional.get();
    }
    public List<Customer> getAllCustomers(){
        return this.customerRepository.findAll(); //bütün listeyi döner.
    }
}
