package com.gitbusycoding.employeeworkdaystracker.domain;

import org.springframework.stereotype.Component;

@Component
public abstract class Employee {

    public static final int MAX_WORK_DAYS_PER_YEAR = 260;

    private long id;
    private float vacationDays = 0;
    private int workDays = 0;

    public Employee(long id) {
        this.id = id;
    }

    public Employee work(int days) {
        workDays += days;
        return this;
    }

    public void takeVacation(float days) {
        vacationDays -= days;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public float getVacationDays() {
        return vacationDays;
    }

    public void setVacationDays(float vacationDays) {
        this.vacationDays = vacationDays;
    }

    public int getWorkDays() {
        return workDays;
    }

    public void setWorkDays(int workDays) {
        this.workDays = workDays;
    }
}
