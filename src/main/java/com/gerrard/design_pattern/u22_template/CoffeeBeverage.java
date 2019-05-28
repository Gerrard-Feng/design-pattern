package com.gerrard.design_pattern.u22_template;

public final class CoffeeBeverage extends BeverageDrive {

    @Override
    public void brew() {
        System.out.println("Dripping coffee through filter");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding sugar and milk");
    }

    @Override
    public boolean customerWantsCondiments() {
        return false;
    }
}
