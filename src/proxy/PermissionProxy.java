package proxy;

public class PermissionProxy implements AbstractPermission {

	private RealPermission permission = new RealPermission();

	private int level = 0;

	@Override
	public void modifyUserInfo() {
		if(0 == level) {
			System.out.println("�Բ�����û�и�Ȩ��!");
		} else if(1 == level) {
			permission.modifyUserInfo();
		}
	}

	@Override
	public void viewNote() {
		permission.viewNote();
	}

	@Override
	public void publishNote() {
		if(0 == level) {
			System.out.println("�Բ�����û�и�Ȩ��!");
		} else if(1 == level) {
			permission.publishNote();
		}		
	}

	@Override
	public void modifyNote() {
		if(0 == level) {
			System.out.println("�Բ�����û�и�Ȩ��!");
		} else if(1 == level) {
			permission.modifyNote();
		}		
	}

	@Override
	public void setLevel(int level) {
		this.level = level;
	}
}