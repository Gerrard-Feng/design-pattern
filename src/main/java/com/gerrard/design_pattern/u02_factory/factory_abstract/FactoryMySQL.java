package com.gerrard.design_pattern.u02_factory.factory_abstract;

public final class FactoryMySQL extends AbsFactory {

	@Override
	public UserMySQL createUser() {
		return new UserMySQL();
	}

	@Override
	public DepartmentMySQL createDepartment() {
		return new DepartmentMySQL();
	}

}
