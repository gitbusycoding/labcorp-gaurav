package com.gitbusycoding.employeeworkdaystracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.SpringVersion;

@SpringBootApplication
public class EmployeeWorkdaysTrackerApplication {

    public static void main(String[] args) {
        System.out.print("SpringVersion.getVersion(): " + SpringVersion.getVersion());
		SpringApplication.run(EmployeeWorkdaysTrackerApplication.class, args);
	}
}
