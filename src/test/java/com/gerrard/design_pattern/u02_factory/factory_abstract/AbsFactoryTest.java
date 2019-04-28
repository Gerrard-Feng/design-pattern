package com.gerrard.design_pattern.u02_factory.factory_abstract;

import org.junit.jupiter.api.Test;

public final class AbsFactoryTest {

	@Test
	public void test1() {
		AbsUser user = new UserDB2();
		AbsDepartment department = new DepartmentDB2();
		user.joinDepartment(department);
		user.personalMethod();
	}

	@Test
	public void test2() {
		AbsUser user = new UserMySQL();
		AbsDepartment department = new DepartmentMySQL();
		user.joinDepartment(department);
		user.personalMethod();
	}

}
