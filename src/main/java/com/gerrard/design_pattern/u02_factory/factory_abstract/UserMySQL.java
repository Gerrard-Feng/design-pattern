package com.gerrard.design_pattern.u02_factory.factory_abstract;

public final class UserMySQL extends AbsUser {

    @Override
    public void register() {
        super.hasRegistered = false;
        System.out.println(this + "register failure");
    }
}
