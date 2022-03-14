package main.junit;

import com.common.design.cglib.MyMethodInterceptor;
import com.common.design.cglib.Target;
import net.sf.cglib.proxy.Enhancer;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasicOnCglibProxyTest {
    private Logger logger = LoggerFactory.getLogger(BasicOnCglibProxyTest.class);
    @Test
    public void test(){
        logger.info("This test case start execute..............");
        Target target = new Target();
        BasicOnCglibProxyTest test = new BasicOnCglibProxyTest();
        Target proxyTarget = (Target) test.createProxy(Target.class);
        String result = proxyTarget.execute();
        System.out.println("执行结果为："+ result);
    }

    private Object createProxy(Class<Target> targetClass) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(targetClass);
        enhancer.setCallback(new MyMethodInterceptor());
        return enhancer.create();
    }


}
