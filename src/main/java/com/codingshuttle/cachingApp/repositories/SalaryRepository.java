package com.codingshuttle.cachingApp.repositories;

import com.codingshuttle.cachingApp.entities.Salary;
import jakarta.persistence.LockModeType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SalaryRepository extends JpaRepository<Salary, Long> {

    @Override
    @Lock(LockModeType.PESSIMISTIC_WRITE)
    Optional<Salary> findById(Long id);
}