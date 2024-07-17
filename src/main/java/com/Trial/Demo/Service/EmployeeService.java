package com.Trial.Demo.Service;

import com.Trial.Demo.model.Employee;
import org.springframework.web.bind.annotation.RequestBody;

public interface EmployeeService
{
    public Employee addNewEmployee(Employee employee);

}
