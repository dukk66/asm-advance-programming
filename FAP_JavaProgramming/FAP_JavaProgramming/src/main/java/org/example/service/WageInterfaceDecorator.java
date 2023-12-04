package org.example.service;

import org.example.interfaces.WageInterface;

public abstract class WageInterfaceDecorator implements WageInterface {
    protected WageInterface decoratedWageInterface;
    public WageInterfaceDecorator(WageInterface decoratedWageInterface) {
        this.decoratedWageInterface = decoratedWageInterface;
    }
    @Override
    public double calculatePay() {
        return decoratedWageInterface.calculatePay();
    }
}
