package com.codingshuttle.cachingApp.services;

import com.codingshuttle.cachingApp.entities.Employee;
import com.codingshuttle.cachingApp.entities.Salary;

public interface SalaryAccountService {
    void createAccount(Employee employee);

    Salary incrementBalance(Long accountId);
}
