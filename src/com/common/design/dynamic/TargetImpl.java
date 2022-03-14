package com.common.design.dynamic;

public class TargetImpl implements Target{
    @Override
    public String execute() {
        System.out.println("TargetImpl execute()..");
        return "execute";
    }
}
