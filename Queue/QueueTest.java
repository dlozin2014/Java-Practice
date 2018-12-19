
public class QueueTest {
    public static void main(String args[]) {
        Queue<Integer> stackInt = new Queue<Integer>();
        for(int i = 0; i < 100; i++) {
            stackInt.push(i);
        }
        while (!stackInt.isEmpty()) {
            System.out.println(stackInt.pop());
        }
    }
}