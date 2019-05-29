package com.gerrard.design_pattern.u22_template;

public abstract class BadBehaviorBeverageDrive {

    protected void boilWater() {
        System.out.println("Boiling water");
    }

    protected void pourInCup() {
        System.out.println("Pouring into cup");
    }

    protected boolean customerWantsCondiments() {
        return true;
    }
}
