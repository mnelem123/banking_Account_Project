package com.CheckbalanceAccount.repository;

import com.CheckbalanceAccount.entity.CheckAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CheckAccountRepository extends JpaRepository<CheckAccount, Long> {
}
