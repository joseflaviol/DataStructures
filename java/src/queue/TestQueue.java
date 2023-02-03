package queue;

/**
 *
 * @author jose
 */
public class TestQueue {
    public static void main(String[] args) {
        LinkedQueue<Integer> queue = new LinkedQueue<>();
        
        queue.enqueue(5);
        queue.enqueue(10);
        queue.enqueue(15);
        
        while ( !queue.isEmpty() ) {
            System.out.println(queue.dequeue());
        }
    }
}
