package edu.iu.p565.customerService.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.iu.p565.customerService.model.Customer;
import edu.iu.p565.customerService.repository.CustomerRepository;

import java.util.List;

@RequestMapping("/customers")
@RestController
public class CustomerController {

    private CustomerRepository repository;
    
    public CustomerController(CustomerRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Customer> findAll(){
        return repository.findAll();
    }

    @PostMapping
    public int create(@RequestBody Customer customer){
        return repository.create(customer);

        
    }
}
