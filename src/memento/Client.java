package memento;

import memento.test.Caretaker;
import memento.test.UserInfoDTO;

public class Client {

	public static void main(String a[]) {
		UserInfoDTO user = new UserInfoDTO();
		Caretaker c = new Caretaker();

		user.setAccount("zhangsan");
		user.setPassword("123456");
		user.setTelNo("13000000000");
		System.out.println("״̬һ??");
		user.show();
		//???汸??¼
		c.setMemento(user.saveMemento());
		System.out.println("---------------------------");

		user.setPassword("111111");
		user.setTelNo("13100001111");
		System.out.println("״̬????");
		user.show();
		System.out.println("---------------------------");

		//?ӱ???¼?лָ?
		user.restoreMemento(c.getMemento());
		System.out.println("?ص?״̬һ??");
		user.show();
		System.out.println("---------------------------");
	}
}