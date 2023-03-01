package com.gitbusycoding.employeeworkdaystracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gitbusycoding.employeeworkdaystracker.domain.Employee;
import com.gitbusycoding.employeeworkdaystracker.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @PostMapping("/employees/{id}/{days}")
    public ResponseEntity<Employee> addWorkDays(@PathVariable long id, @PathVariable int days) {

        if (days > 260) {
            return ResponseEntity.badRequest().body(null);
        }

        Employee emp = service.logWorkDays(id, days);

        if (emp != null) {
            return ResponseEntity.ok(emp);
        } else {
            return ResponseEntity.badRequest().body(null);
        }
    }
}
