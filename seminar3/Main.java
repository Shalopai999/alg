import org.w3c.dom.Node;

public class Main {
    public static void main(String[] args) {
        Linlist list = new Linlist();
        list.addFirst(1);
        list.removeLast();
        list.addFirst(0);
        list.addLast(2);
        list.removeLast();
        list.addLast(3);
        list.addLast(2);
        list.addFirst(5);
        list.print();
        System.out.println();
        list.reverse();
        list.print();
//        if (!list.contains(30)){
//            System.out.println("Элемента с таким значением не существует");
//        }
    }
}