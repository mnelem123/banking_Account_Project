package comD.group10.project.customerservice.controller;

import comD.group10.project.customerservice.model.Customer;
import comD.group10.project.customerservice.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @PostMapping
    public ResponseEntity<Customer> saveCustomer(@RequestBody Customer customer){
        Customer savedCustomer = customerService.saveCustomer(customer);
        return new ResponseEntity<>(savedCustomer, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<Optional<Customer>> getCustomerById(@PathVariable("id") Long customerId){
        Optional<Customer> customer = customerService.getCustomerById(customerId);
        return ResponseEntity.ok(customer);
    }
}
