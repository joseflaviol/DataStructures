package utils;

/**
 *
 * @author jose
 */
public class Node<Item> {
    private Item item;
    private Node next;
    
    public Node(Item item) {
        this.item = item;
    }
    
    public void setItem(Item item) {
        this.item = item;
    }
    
    public Item getItem() {
        return this.item;
    }
    
    public void setNext(Node node) {
        this.next = node;
    }
    
    public Node getNext() {
        return this.next;
    }
}
