package com.Trial.Demo.Service;

import com.Trial.Demo.model.Employee;
import com.Trial.Demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService
{
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee addNewEmployee(Employee employee)
    {
        Employee savedEmployee = employeeRepository.save(employee);
        return savedEmployee;
    }
}
