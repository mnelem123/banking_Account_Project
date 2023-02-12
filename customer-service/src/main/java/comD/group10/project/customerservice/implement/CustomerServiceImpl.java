package comD.group10.project.customerservice.implement;

import comD.group10.project.customerservice.model.Customer;
import comD.group10.project.customerservice.repository.CustomerRepository;
import comD.group10.project.customerservice.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private final CustomerRepository customerRepository;
    public Customer saveCustomer(Customer customer){

        return customerRepository.save(customer);
    }
    public Optional<Customer> getCustomerById(Long customerId){

        return customerRepository.findById(customerId);
    }
}
