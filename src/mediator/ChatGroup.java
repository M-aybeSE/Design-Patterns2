package mediator;

import java.util.*;

public class ChatGroup extends AbstractChatroom {

	private Hashtable members = new Hashtable();
	
	@Override
	public void register(Member member) {
		if(!members.contains(member)) {
			members.put(member.getName(), member);
			member.setChatroom(this);
		}
	}
	
   @Override
   public void sendText(String from, String to, String message) {
   	  Member member = (Member)members.get(to);
   	  // ģ?????˲????ַ?????
   	  String newMessage = message.replaceAll("??","*");
	  member.receiveText(from, newMessage);
   }
   
   @Override
   public void sendImage(String from, String to, String image) {
   	  Member member = (Member)members.get(to);
   	  //ģ??ͼƬ??С?ж?
   	  if(image.length() > 5) {
   	  	  System.out.println("ͼƬ̫?󣬷???ʧ?ܣ?");
   	  } else {
   	  	  member.receiveImage(from, image);
   	  }
   }
}