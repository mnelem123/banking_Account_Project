package comD.group10.project.customerservice.service;

import comD.group10.project.customerservice.model.Customer;

import java.util.Optional;

public interface CustomerService {
    public Customer saveCustomer(Customer customer);

    public Optional<Customer> getCustomerById(Long customerId);
}
