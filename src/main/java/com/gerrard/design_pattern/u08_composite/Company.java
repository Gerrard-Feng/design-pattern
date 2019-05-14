package com.gerrard.design_pattern.u08_composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class Company extends CompanyItem {

    private List<CompanyItem> childComponents = new ArrayList<>();

    public Company(String name) {
        super(name);
    }

    @Override
    public void addCompanyItem(CompanyItem component) {
        childComponents.add(component);
    }

    @Override
    public void removeCompanyItem(CompanyItem component) {
        childComponents.remove(component);
    }

    @Override
    public void lineOfDuty() {
        childComponents.forEach(companyItem -> companyItem.lineOfDuty());
    }

    @Override
    public void showStructure(int depth) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < depth; ++i) {
            builder.append("-");
        }
        System.out.println(builder.append(name));
        childComponents.forEach(companyItem -> companyItem.showStructure(depth + 1));
    }

    @Override
    public Iterator createIterator() {
        return new CompositeIterator<CompanyItem>(childComponents.iterator());
    }
}
