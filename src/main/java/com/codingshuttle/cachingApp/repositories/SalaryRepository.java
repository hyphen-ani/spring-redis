package com.codingshuttle.cachingApp.repositories;

import com.codingshuttle.cachingApp.entities.Salary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalaryRepository extends JpaRepository<Salary, Long> {
}