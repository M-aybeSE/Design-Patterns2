package visitor;

public class Customer extends Visitor {

    @Override
    public void visit(Apple apple) {
        System.out.println("�˿�" + name + "ѡƻ����");
    }

    @Override
    public void visit(Book book) {
        System.out.println("�˿�" + name + "���顣");
    }
}