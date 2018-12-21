
public class StackTest {
    public static void main(String args[]) {
        Stack<Integer> stackInt = new Stack<Integer>();
        for(int i = 0; i < 100; i++) {
            stackInt.push(i);
        }
        while (!stackInt.isEmpty()) {
            System.out.println(stackInt.pop());
        }
    }
}