package com.gerrard.design_pattern.u22_template;

public final class BadBehaviorTeaBeverage extends BadBehaviorBeverageDrive {

    public final void prepareRecipe() {
        super.boilWater();
        steepTeaBags();
        super.pourInCup();
        if (super.customerWantsCondiments()) {
            addLemon();
        }
    }

    private void steepTeaBags() {
        System.out.println("Steeping the tea");
    }

    private void addLemon() {
        System.out.println("Adding lemon");
    }
}
