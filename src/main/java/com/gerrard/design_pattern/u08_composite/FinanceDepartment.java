package com.gerrard.design_pattern.u08_composite;

import java.util.Iterator;

public final class FinanceDepartment extends CompanyItem {

    public FinanceDepartment(String name) {
        super(name);
    }

    @Override
    public void lineOfDuty() {
        System.out.println(name + ", treasurer is in charge of payroll");
    }

    @Override
    public void showStructure(int depth) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < depth; ++i) {
            builder.append("-");
        }
        System.out.println(builder.append(name));
    }

    @Override
    public Iterator createIterator() {
        return new LeafIterator();
    }
}
