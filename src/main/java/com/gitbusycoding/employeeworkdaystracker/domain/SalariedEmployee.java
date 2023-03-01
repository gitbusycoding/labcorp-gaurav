package com.gitbusycoding.employeeworkdaystracker.domain;

import org.springframework.stereotype.Component;

@Component
public class SalariedEmployee extends Employee {

    static final int MAX_VACATION_DAYS = 15;

    public SalariedEmployee(long id) {
        super(id);
    }
}
