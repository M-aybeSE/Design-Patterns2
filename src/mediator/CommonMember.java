package mediator;

public class CommonMember extends Member {

	public CommonMember(String name) {
		super(name);
	}
	
	@Override
	public void sendText(String to, String message) {
	    System.out.println("普通会员发送消息:" + message);
		//发送文本
	    chatroom.sendText(name,to,message);
	}
	
	@Override
	public void sendImage(String to, String image) {
		System.out.println("普通会员不能发送图片！");
	}
}