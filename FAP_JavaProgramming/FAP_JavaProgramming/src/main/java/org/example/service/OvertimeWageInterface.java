package org.example.service;

import org.example.interfaces.WageInterface;

public class OvertimeWageInterface extends WageInterfaceDecorator {
    private int overtimeHours;
    private double overtimeRate;
    public OvertimeWageInterface(WageInterface decoratedWageInterface, int overtimeHours, double overtimeRate) {
        super(decoratedWageInterface);
        this.overtimeHours = overtimeHours;
        this.overtimeRate = overtimeRate;
    }
    @Override
    public double calculatePay() {
        double basePay = super.calculatePay();
        double overtimePay = overtimeHours * overtimeRate;
        return basePay + overtimePay;
    }
}
