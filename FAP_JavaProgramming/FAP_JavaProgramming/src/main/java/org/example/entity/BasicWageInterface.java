package org.example.entity;


import org.example.interfaces.WageInterface;
// Lớp cơ bản Wage
public class BasicWageInterface implements WageInterface {
    private String employeeName;
    private double hourlyRate;
    private int hoursWorked;
    public BasicWageInterface(String employeeName, double hourlyRate, int hoursWorked) {
        this.employeeName = employeeName;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }
    public String getEmployeeName() {
        return employeeName;
    }
    public double getHourlyRate() {
        return hourlyRate;
    }
    public int getHoursWorked() {
        return hoursWorked;
    }
}
