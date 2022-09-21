package mediator;

public class DiamondMember extends Member {

	public DiamondMember(String name) {
		super(name);
	}
	
	@Override
	public void sendText(String to, String message) {
	    System.out.println("��ʯ��Ա������Ϣ: " + message);
		// �����ı�
	    chatroom.sendText(name, to, message);
	}
	
	@Override
	public void sendImage(String to, String image) {
		System.out.println("��ʯ��Ա����ͼƬ: " + image);
		// ����ͼƬ
	    chatroom.sendImage(name, to, image);
	}
}