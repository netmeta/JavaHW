package hw4;
import java.util.LinkedList;
public class Task2 {
    public static LinkedList<Integer> enqueue(LinkedList<Integer> linkedList, int element) {
        linkedList.addLast(element);

        return linkedList;
    }

    public static int dequeue(LinkedList<Integer> linkedList) {
        int firstElement = linkedList.getFirst();
        linkedList.pollFirst();
        System.out.println("Очередь после удаления элемента: " + linkedList);

        return firstElement;
    }

    public static int first(LinkedList<Integer> linkedList) {
        return linkedList.getFirst();
    }

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            linkedList.add((int) (Math.random() * (10 - 1)));
        }
        int element = 22;
        System.out.println("Очередь: " + linkedList);
        System.out.println("Очередь после добавления элемента: " + enqueue(linkedList, element) + "\n"
                + "Добавляемый элемент " + element);
        System.out.println("Удаляемый элемент: " + dequeue(linkedList));
        System.out.println("Первый элемент: " + first(linkedList));
    }
}
