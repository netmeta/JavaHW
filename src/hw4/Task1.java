package hw4;
import java.util.LinkedList;
public class Task1 {
    public static LinkedList<Integer> getReversDeque(int count) {
        LinkedList<Integer> deque = new LinkedList<>();
        LinkedList<Integer> reverseDeque = new LinkedList<>();

        for (int i = 0; i < count; i++) {
            int rand = (int) (Math.random() * (100 - 1));
            deque.addFirst(rand);
        }
        System.out.println(deque);

        for (int i = 0; i < count; i++) {
            reverseDeque.addFirst(deque.getFirst());
            deque.removeFirst();
        }
        return reverseDeque;
    }

    public static void main(String[] args) {

        System.out.println(getReversDeque(10));

    }
}
