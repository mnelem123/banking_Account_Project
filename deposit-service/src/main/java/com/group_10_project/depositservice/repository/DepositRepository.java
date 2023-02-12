package com.group_10_project.depositservice.repository;

import com.group_10_project.depositservice.model.Deposit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepositRepository extends JpaRepository<Deposit, Long> {
}
