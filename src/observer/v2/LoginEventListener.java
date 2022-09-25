package observer.v2;

/**
 * @author linhx
 * @date 2022-09-23 16:43
 */
public interface LoginEventListener {

    void validateLogin(LoginEvent event);
}
