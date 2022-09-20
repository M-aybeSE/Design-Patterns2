package iterator;

public class TCLTelevision implements Television {

	private Object[] obj = {
		"��������", "��������", "�Ϻ�����",
		"��������", "����������"
	};

	@Override
	public TVIterator createIterator() {
		return new TCLIterator();
	}
   
	class TCLIterator implements TVIterator {

	   	private int currentIndex = 0;
	   	 	
		@Override
		public void next() {
			if(currentIndex < obj.length) {
				currentIndex++;
			}
		}
		
		@Override
		public void previous() {
			if(currentIndex > 0) {
				currentIndex--;
			}
		}	
		
		@Override
		public void setChannel(int i) {
			currentIndex = i;
		}
		
		
		@Override
		public Object currentChannel() {
			return obj[currentIndex];
		}
		
		@Override
		public boolean isLast() {
			return currentIndex == obj.length;
		}
	
		@Override
		public boolean isFirst() {
			return currentIndex == 0;
		}
	}
}