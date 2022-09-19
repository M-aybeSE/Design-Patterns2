package proxy.dynamic;

import proxy.AbstractPermission;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author linhx
 * @date 2022-09-14 17:26
 */
public class DynamicClient {

    public static void main(String[] args) {
        InvocationHandler handler = null;
        AbstractSubject subject = null;

        handler = new DynamicProxy(new RealSubjectA());
        subject = (AbstractSubject) Proxy.newProxyInstance(AbstractSubject.class.getClassLoader(),
                new Class[]{AbstractSubject.class}, handler);
        subject.request();

        System.out.println("--------------------------------");

        handler = new DynamicProxy(new RealSubjectB());
        subject = (AbstractSubject) Proxy.newProxyInstance(AbstractSubject.class.getClassLoader(),
                new Class[]{AbstractSubject.class}, handler);
        subject.request();
    }
}
