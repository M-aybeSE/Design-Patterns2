package decorator;

public class Airplane extends Changer {

	public Airplane(Transform transform) {
		super(transform);
		System.out.println("��ɷɻ���");
	}

	@Override
	public void move() {
		super.move();
		fly();
	}

	public void fly() {
		System.out.println("����շ��裡");	
	}
}