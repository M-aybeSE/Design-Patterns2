package proxy;

public class RealPermission implements AbstractPermission {

	@Override
	public void modifyUserInfo() {
		System.out.println("�޸��û���Ϣ��");
	}

	@Override
	public void viewNote() {
		System.out.println("�鿴���ӣ�");
	}

	@Override
	public void publishNote() {
		System.out.println("����������");
	}

	@Override
	public void modifyNote() {
		System.out.println("�޸ķ������ݣ�");
	}

	@Override
	public void setLevel(int level) {
	}
}