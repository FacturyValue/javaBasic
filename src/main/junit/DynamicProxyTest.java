package main.junit;

import com.common.design.dynamic.DynamicProxyHandler;
import com.common.design.dynamic.Target;
import com.common.design.dynamic.TargetImpl;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Proxy;

public class DynamicProxyTest {
    @Before
    public void before(){
    }


    @After
    public void after(){
    }

    @Test
    public void test() throws Exception {
        Target target = new TargetImpl();
        DynamicProxyHandler handler = new DynamicProxyHandler(target);
        Target proxy = (Target) Proxy.newProxyInstance(TargetImpl.class.getClassLoader(),TargetImpl.class.getInterfaces(),handler);
        String result = proxy.execute();
        System.out.println("执行结果为："+result);
    }
}
