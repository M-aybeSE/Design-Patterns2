package observer.v2;

import java.util.EventObject;

/**
 * @author linhx
 * @date 2022-09-23 16:37
 */
public class LoginEvent extends EventObject {

    private String userName;

    private String paasword;

    public LoginEvent(Object source, String userName, String paasword) {
        super(source);
        this.userName = userName;
        this.paasword = paasword;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setPaasword(String paasword) {
        this.paasword = paasword;
    }

    public String getPaasword() {
        return this.paasword;
    }

}
