package com.gitbusycoding.employeeworkdaystracker.domain;

import org.springframework.stereotype.Component;

@Component
public class Manager extends SalariedEmployee {

    static final int MAX_VACATION_DAYS = 30;

    public Manager(long id, float maxVacationDays) {
        super(id);
    }
}
