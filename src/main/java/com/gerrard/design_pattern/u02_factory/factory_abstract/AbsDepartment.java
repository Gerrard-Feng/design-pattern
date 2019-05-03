package com.gerrard.design_pattern.u02_factory.factory_abstract;

public abstract class AbsDepartment {

	@Override
	public String toString() {
		return "Department[" + this.getClass().getSimpleName() + ":" + this.hashCode() + "]";
	}
}
