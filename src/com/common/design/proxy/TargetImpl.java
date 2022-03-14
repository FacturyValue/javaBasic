package com.common.design.proxy;

public class TargetImpl implements TargetStatic{
    @Override
    public String execute() {
        System.out.println("TargetImpl execute!");
        return "execute";
    }
}
