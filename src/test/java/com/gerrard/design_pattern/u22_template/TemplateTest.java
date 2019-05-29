package com.gerrard.design_pattern.u22_template;

import org.junit.jupiter.api.Test;

public final class TemplateTest {

    @Test
    void testTea() {
        BeverageDrive tea = new TeaBeverage();
        tea.prepareRecipe();
    }

    @Test
    void testCoffee() {
        BeverageDrive coffee = new CoffeeBeverage();
        coffee.prepareRecipe();
    }

    @Test
    void testCounterExample() {
        BadBehaviorBeverageDrive tea = new BadBehaviorTeaBeverage();
        ((BadBehaviorTeaBeverage) tea).prepareRecipe();
    }
}
