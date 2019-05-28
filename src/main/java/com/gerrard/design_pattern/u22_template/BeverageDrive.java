package com.gerrard.design_pattern.u22_template;

public abstract class BeverageDrive {

    // Template method
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    // Abstract method
    protected abstract void brew();

    protected abstract void addCondiments();

    // Concrete method
    private void boilWater() {
        System.out.println("Boiling water");
    }

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }

    // Hook method
    protected boolean customerWantsCondiments() {
        return true;
    }
}
