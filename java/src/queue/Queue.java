package queue;

/**
 *
 * @author jose
 */
public interface Queue<Item> {
    void enqueue(Item item);
    
    Item dequeue();
    
    boolean isEmpty();
}
