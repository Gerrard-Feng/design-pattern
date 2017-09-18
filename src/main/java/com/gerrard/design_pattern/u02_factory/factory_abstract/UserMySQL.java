package com.gerrard.design_pattern.u02_factory.factory_abstract;

public final class UserMySQL extends AbsUser {

	@Override
	public void personalMethod() {
		System.out.println("MySQL用户的个人行为");
	}

	@Override
	public void joinDepartment(AbsDepartment department) {
		if (department instanceof DepartmentMySQL) {
			department = (DepartmentMySQL) department;
		} else {
			throw new RuntimeException("只接受 MySQL数据库创建的部门");
		}
		System.out.println(this.toString() + "加入部门：" + department.toString());
	}

}
