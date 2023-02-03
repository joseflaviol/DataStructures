package queue;

import utils.Node;

/**
 *
 * @author jose
 */
public class LinkedQueue<Item> implements Queue<Item> {
    private Node head;
    private Node tail;
    
    public LinkedQueue() {
        this.head = null;
        this.tail = null;
    }
    
    public void enqueue(Item item) {
        Node tmp = new Node(item);
        
        if (this.tail != null) {
            this.tail.setNext(tmp);
        } else {
            this.head = tmp;
        }
        
        this.tail = tmp;
    }
    
    public Item dequeue() {
        Item ret = null;
        
        if (this.head != null) {
            ret = (Item) this.head.getItem();
            this.head = this.head.getNext();
            
            if (this.head == null) {
                this.tail = null;
            } 
        }
        
        return ret;
    }
    
    public boolean isEmpty() {
        return this.head == null;
    }
}
