package main.test;

import com.common.design.proxy.Proxy;
import com.common.design.proxy.TargetImpl;
import com.common.design.proxy.TargetStatic;

public class ProxyStaticTest {
    public static void main(String[] args) {
        TargetStatic target = new TargetImpl();
        Proxy proxy = new Proxy(target);
        String execute = proxy.execute();
        System.out.println("静态代理对象调用结果："+execute);
    }
}
