package proxy.dynamic;

/**
 * @author linhx
 * @date 2022-09-14 17:33
 */
public class RealSubjectA implements AbstractSubject {

    @Override
    public void request() {
        System.out.println("真实主题类A!");
    }
}
