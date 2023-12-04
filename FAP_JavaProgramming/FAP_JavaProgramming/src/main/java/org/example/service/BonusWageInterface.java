package org.example.service;

import org.example.interfaces.WageInterface;

public class BonusWageInterface extends WageInterfaceDecorator {
    private double bonusAmount;
    public BonusWageInterface(WageInterface decoratedWageInterface, double bonusAmount) {
        super(decoratedWageInterface);
        this.bonusAmount = bonusAmount;
    }
    @Override
    public double calculatePay() {
        double basePay = super.calculatePay();
        return basePay + bonusAmount;
    }
}