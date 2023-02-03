package stack;

/**
 *
 * @author jose
 */
public class TestStack {
    public static void main(String[] args) {
        LinkedStack<Integer> stack = new LinkedStack<>();
        
        stack.push(5);
        stack.push(6);
        stack.push(15);
        
        while ( !stack.isEmpty() ) {
            System.out.println(stack.pop());
        }
    }
}
