package com.codingshuttle.cachingApp.services.impl;

import com.codingshuttle.cachingApp.entities.Employee;
import com.codingshuttle.cachingApp.entities.Salary;
import com.codingshuttle.cachingApp.repositories.SalaryRepository;
import com.codingshuttle.cachingApp.services.SalaryAccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@RequiredArgsConstructor
public class SalaryAccountServiceImpl implements SalaryAccountService {

    private final SalaryRepository salaryRepository;

    @Override
    public void createAccount(Employee employee) {
        if(employee.getName().equals("Shivam")) throw new RuntimeException("Shivam is not allowed");

        Salary salary = Salary.builder()
                .employee(employee)
                .balance(BigDecimal.ZERO)
                .build();

        salaryRepository.save(salary);
    }
}
