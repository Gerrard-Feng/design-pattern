package com.gerrard.design_pattern.u08_composite;

import org.junit.jupiter.api.Test;

import java.util.Iterator;

public final class CompositeTest {

    private CompanyItem createParentCompany() {
        CompanyItem parentCompany = new Company("Shanghai parent company");
        parentCompany.addCompanyItem(new HRDepartment("Parent company HR department"));

        CompanyItem southChildCompany = new Company("South child company");
        southChildCompany.addCompanyItem(new HRDepartment("South child company HR department"));
        parentCompany.addCompanyItem(southChildCompany);

        CompanyItem hongKongOffice = new Company("HongKong office");
        hongKongOffice.addCompanyItem(new FinanceDepartment("Hongkong office Finance department"));
        southChildCompany.addCompanyItem(hongKongOffice);

        parentCompany.addCompanyItem(new FinanceDepartment("Parent company Finance department"));
        return parentCompany;
    }

    @Test
    void testComposite() {
        CompanyItem parentCompany = createParentCompany();
        parentCompany.showStructure(1);
        System.out.println("===========================");
        parentCompany.lineOfDuty();
    }

    @Test
    void testCompositeIterator() {
        CompanyItem parentCompany = createParentCompany();
        Iterator iterator = parentCompany.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
