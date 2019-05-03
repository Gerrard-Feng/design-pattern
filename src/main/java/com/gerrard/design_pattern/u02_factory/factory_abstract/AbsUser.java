package com.gerrard.design_pattern.u02_factory.factory_abstract;

public abstract class AbsUser {

    protected boolean hasRegistered = false;

    protected void joinDepartment(AbsDepartment department) {
        if (hasRegistered) {
            System.out.println(this + " join " + department);
        } else {
            System.out.println(this + " not registered cannot join department");
        }
    }

    protected abstract void register();

    @Override
    public String toString() {
        return "User[" + this.getClass().getSimpleName() + ":" + this.hashCode() + "]";
    }
}
