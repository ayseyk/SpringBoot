package com.StajOkulu.demo.customer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    /*@GetMapping("/demo")
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
    }*/

    @PostMapping
    public void saveCustomer(@RequestBody Customer customer){
        this.customerService.saveCustomer(customer);
    }
    @DeleteMapping("/{id}")
    public void deleteCustomerByIdOther(@PathVariable Integer id) { //localhost:8080/customer/101 şeklinde siliniyor
        this.customerService.deleteCustomerById(id);
    }
    @GetMapping("/{id}")
    public Customer getDemoCustomer(@PathVariable Integer id) {
        return this.customerService.getCustomerById(id);
    }
    @GetMapping("/list")
    public List<Customer> getDefaultCustomerList() {
        return this.customerService.getAllCustomers();
    }

    /*@PostMapping
    public void saveCustomer(@RequestBody Customer customer){
        Util.getDefaultCustomerList().add(customer);//var olan listemize ekledik.
    }

    @DeleteMapping
    public void deleteCustomer(@RequestBody Customer customer){
        Util.getDefaultCustomerList().removeIf(p-> p.getId().equals(customer.getId()));
    }

    @DeleteMapping("/id") //buradan direkt id alınmasını sağlayıp @requestbody kullanmaya gerek yok!
    public void deleteCustomerById(@RequestBody Integer id){ //json formatında alacak veriyi integer id ye çevirecek.
        Util.getDefaultCustomerList().removeIf(p-> p.getId().equals(id));
    }

    @DeleteMapping("/{id}")
    public void deleteCustomerByIdOther(@PathVariable Integer id){ //localhost:8080/customer/101 şeklinde siliniyor
        Util.getDefaultCustomerList().removeIf(p-> p.getId().equals(id));
    }*/

}
