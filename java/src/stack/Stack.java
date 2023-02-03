package stack;

/**
 *
 * @author jose
 */
public interface Stack<Item> {
    void push(Item item);
    
    Item pop();
    
    boolean isEmpty();
}
