package com.gerrard.design_pattern.u08_composite;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.Iterator;

@Data
@AllArgsConstructor
@ToString
public abstract class CompanyItem {

    protected String name;

    protected void addCompanyItem(CompanyItem companyItem) {
        throw new UnsupportedOperationException("Not support to add companyItem");
    }

    protected void removeCompanyItem(CompanyItem companyItem) {
        throw new UnsupportedOperationException("Not support to remove companyItem");
    }

    protected abstract void lineOfDuty();

    protected abstract void showStructure(int depth);

    protected abstract Iterator createIterator();
}
