package com.common.design.proxy;

/**
 *  代理类
 */
public class Proxy implements TargetStatic{
    private TargetStatic target;
    public Proxy(TargetStatic target){
        this.target =target;
    }
    @Override
    public String execute() {
        System.out.println("execute执行前...");
        String result = this.target.execute();
        System.out.println("execute执行后...");
        return result;
    }
}
