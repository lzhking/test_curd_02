package com.ssm.curd.test;

import com.ssm.curd.service.EmployeeService;

public class main {
    public static void main(String[] args) {
        EmployeeService employeeService;
        employeeService=new EmployeeService();
        System.out.println(employeeService.getAll());
    }
}
