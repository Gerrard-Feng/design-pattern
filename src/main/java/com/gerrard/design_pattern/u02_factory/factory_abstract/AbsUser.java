package com.gerrard.design_pattern.u02_factory.factory_abstract;

public abstract class AbsUser {

	protected void joinDepartment(AbsDepartment department) {
		System.out.println(this.toString() + "不能加入任何部门");
	}

	protected abstract void personalMethod();

	@Override
	public String toString() {
		return this.getClass().getSimpleName().substring(4) + "用户";
	}

}
