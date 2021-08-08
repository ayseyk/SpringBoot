package com.stajokulu.demo.customer;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @GetMapping("/demo")
    public String demo() {

        return "Merhaba Stajokulu";
    }

    @GetMapping("/sample")
    public Customer getDemoCustomer() {

        Customer customer = new Customer(101, "Hüseyin", "Çakmak");

        return customer;
    }

    @GetMapping("/list")
    public List<Customer> getDefaultCustomerList() {

        return Util.getDefaultCustomerList();
    }

}
