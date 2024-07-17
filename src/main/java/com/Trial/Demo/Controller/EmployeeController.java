package com.Trial.Demo.Controller;

import com.Trial.Demo.Service.EmployeeService;
import com.Trial.Demo.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController
{
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/addnewEmployee")
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee)
    {
        Employee employee1 = this.employeeService.addNewEmployee(employee);

        return new ResponseEntity<>(employee1, HttpStatus.CREATED);
    }

}
