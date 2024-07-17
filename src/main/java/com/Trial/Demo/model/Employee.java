package com.Trial.Demo.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="Employee_Table")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long employeeId;

    @Column(name="Employee_Name")
    private String employeeName;
    @Column(name="Employee_Salary")
    private double employeeSalary;

    @Column(name="Employee_Department")
    private String employeeDepartment;

    @Column(name="Employee_Project_Name")
    private String employeeProjectName;
}
