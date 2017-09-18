package com.gerrard.design_pattern.u02_factory.factory_abstract;

public final class FactoryDB2 extends AbsFactory {

	@Override
	public UserDB2 createUser() {
		return new UserDB2();
	}

	@Override
	public DepartmentDB2 createDepartment() {
		return new DepartmentDB2();
	}

}
