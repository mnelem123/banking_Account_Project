package comD.group10.project.customerservice.repository;

import comD.group10.project.customerservice.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
