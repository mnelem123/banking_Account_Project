package com.Banking.Account.Banking.repository;

import com.Banking.Account.Banking.entity.Withdraw;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface WithdrawRepository extends JpaRepository<Withdraw, Long> {

    Optional<Withdraw> findAllById(Long id);
}
