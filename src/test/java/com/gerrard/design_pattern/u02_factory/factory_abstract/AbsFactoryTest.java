package com.gerrard.design_pattern.u02_factory.factory_abstract;

import org.junit.jupiter.api.Test;

public final class AbsFactoryTest {

	@Test
	void testFactoryDB2() {
	    AbsFactory factory = new FactoryDB2();
		AbsUser user = factory.createUser();
		AbsDepartment department = factory.createDepartment();
		user.register();
		user.joinDepartment(department);
	}

	@Test
	void testFactoryMySQL() {
        AbsFactory factory = new FactoryMySQL();
        AbsUser user = factory.createUser();
        AbsDepartment department = factory.createDepartment();
        user.register();
        user.joinDepartment(department);
	}
}
