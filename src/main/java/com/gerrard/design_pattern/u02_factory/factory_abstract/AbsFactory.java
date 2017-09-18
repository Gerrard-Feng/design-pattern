package com.gerrard.design_pattern.u02_factory.factory_abstract;

public abstract class AbsFactory {

	protected abstract AbsUser createUser();

	protected abstract AbsDepartment createDepartment();

}
