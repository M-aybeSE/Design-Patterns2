package observer.v2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author linhx
 * @date 2022-09-23 16:44
 */
public class LoginBean extends JPanel implements ActionListener {

    JLabel labUserName, labPassword;
    JTextField txtUserName;
    JPasswordField txtPassword;
    JButton btnLogin, btnClear;

    /**
     * 定义一个抽象观察者对象
     */
    LoginEventListener lel;

    /**
     * 定义一个时间对象用于传输数据
     */
    LoginEvent le;

    public LoginBean() {
        this.setLayout(new GridLayout(3, 2));
        labUserName = new JLabel("User Name:");
        add(labUserName);

        txtUserName = new JTextField(20);
        add(txtUserName);

        labPassword = new JLabel("password");
        add(labPassword);

        btnLogin = new JButton("Login");
        add(btnLogin);

        btnClear = new JButton("Clear");
        add(btnClear);

        btnClear.addActionListener(this);
        btnLogin.addActionListener(this);
    }

    /**
     * 实现注册方法
     * @param lel
     */
    public void addLoginEventListener(LoginEventListener lel) {
        this.lel = lel;
    }

    private void fireLoginEvent(Object object, String userName, String password) {
        le = new LoginEvent(btnLogin, userName, password);
        lel.validateLogin(le);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (btnLogin == event.getSource()) {
            String userName = this.txtUserName.getText();
            String password = this.txtPassword.getText();

            fireLoginEvent(btnLogin, userName, password);
        }

        if (btnClear == event.getSource()) {
            this.txtUserName.setText("");
            this.txtPassword.setText("");
        }
    }
}
