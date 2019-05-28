package com.gerrard.design_pattern.u22_template;

public final class TeaBeverage extends BeverageDrive {

    @Override
    public void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding lemon");
    }
}
