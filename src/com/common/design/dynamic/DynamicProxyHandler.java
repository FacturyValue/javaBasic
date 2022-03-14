package com.common.design.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DynamicProxyHandler implements InvocationHandler {

    private Logger logger = Logger.getLogger("DynamicProxyHandler");
    private Target target;
    public DynamicProxyHandler(Target target){
        this.target = target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//        logger.log(Level.INFO,"execute执行前........");
        System.out.println("==============");
        Object result = method.invoke(target,args);
        System.out.println("==============");
//        logger.log(Level.INFO,"execute执行后........");
        return result;
    }
}
