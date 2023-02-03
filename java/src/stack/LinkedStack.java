package stack;

import utils.Node;

/**
 *
 * @author jose
 */
public class LinkedStack<Item> implements Stack<Item> {
      
    private Node top;
    
    public LinkedStack() {
        this.top = null;
    }
    
    public void push(Item item) {
        Node tmp = new Node(item);
        
        tmp.setNext(this.top);
        this.top = tmp;
    }
    
    public Item pop() {
        if (this.isEmpty()) {
            return null;
        }
        
        Node tmp = this.top;
        
        this.top = this.top.getNext();
        
        return (Item) tmp.getItem();
    }
    
    public boolean isEmpty() {
        return this.top == null;
    }
    
}
