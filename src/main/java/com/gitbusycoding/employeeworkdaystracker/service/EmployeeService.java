package com.gitbusycoding.employeeworkdaystracker.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.gitbusycoding.employeeworkdaystracker.domain.Employee;
import com.gitbusycoding.employeeworkdaystracker.domain.HourlyEmployee;
import com.gitbusycoding.employeeworkdaystracker.domain.Manager;
import com.gitbusycoding.employeeworkdaystracker.domain.SalariedEmployee;

@Service
public class EmployeeService {

    private static final int NUM_EMPLOYEES_OF_EACH_TYPE = 10;

    private List<HourlyEmployee> hourlies = new ArrayList<>(NUM_EMPLOYEES_OF_EACH_TYPE);
    private List<SalariedEmployee> salaried = new ArrayList<>(NUM_EMPLOYEES_OF_EACH_TYPE);
    private List<Manager> managers = new ArrayList<>(NUM_EMPLOYEES_OF_EACH_TYPE);

    public EmployeeService() {

        for (long i = 0; i < NUM_EMPLOYEES_OF_EACH_TYPE; i++) {
            hourlies.add(new HourlyEmployee(i));
        }
    }

    public Employee logWorkDays(long id, int days) {

        Employee emp = find(id);

        return emp == null ? null : emp.work(days);
    }

    public Employee find(long id) {

        Employee found = null;

        Optional<HourlyEmployee> optHourly = hourlies.stream()
            .filter(e -> e.getId() == id)
            .findAny();

        if (optHourly.isPresent()) {
            found = optHourly.get();

        } else {
            Optional<SalariedEmployee> optSalaried = salaried.stream()
                .filter(e -> e.getId() == id)
                .findAny();

            if (optSalaried.isPresent()) {
                found = optSalaried.get();

            } else {
                Optional<Manager> optManager = managers.stream()
                    .filter(e -> e.getId() == id)
                    .findAny();

                if (optManager.isPresent()) {
                    found = optManager.get();
                }
            }
        }

        return found;
    }

    public List<HourlyEmployee> getHourlies() {
        return hourlies;
    }

    public void setHourlies(List<HourlyEmployee> hourlies) {
        this.hourlies = hourlies;
    }

    public List<SalariedEmployee> getSalaried() {
        return salaried;
    }

    public void setSalaried(List<SalariedEmployee> salaried) {
        this.salaried = salaried;
    }

    public List<Manager> getManagers() {
        return managers;
    }

    public void setManagers(List<Manager> managers) {
        this.managers = managers;
    }
}
