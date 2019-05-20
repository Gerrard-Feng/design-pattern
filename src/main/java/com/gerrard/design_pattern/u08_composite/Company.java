package com.gerrard.design_pattern.u08_composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class Company extends CompanyItem {

    private List<CompanyItem> childCompanyItems = new ArrayList<>();

    public Company(String name) {
        super(name);
    }

    @Override
    public void addCompanyItem(CompanyItem component) {
        childCompanyItems.add(component);
    }

    @Override
    public void removeCompanyItem(CompanyItem component) {
        childCompanyItems.remove(component);
    }

    @Override
    public void lineOfDuty() {
        childCompanyItems.forEach(companyItem -> companyItem.lineOfDuty());
    }

    @Override
    public void showStructure(int depth) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < depth; ++i) {
            builder.append("-");
        }
        System.out.println(builder.append(name));
        childCompanyItems.forEach(companyItem -> companyItem.showStructure(depth + 1));
    }

    @Override
    public Iterator createIterator() {
        return new CompositeIterator<CompanyItem>(childCompanyItems.iterator());
    }
}
