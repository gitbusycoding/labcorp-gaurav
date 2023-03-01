package com.gitbusycoding.employeeworkdaystracker.domain;

import org.springframework.stereotype.Component;

@Component
public class HourlyEmployee extends Employee {

    static final int MAX_VACATION_DAYS = 10;

    public HourlyEmployee(long id) {
        super(id);
    }
}
