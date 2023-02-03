package utils;

/**
 *
 * @author jose
 */
public class DictionaryNode<Key extends Comparable<Key>, Value> {
    
    private Key key;
    private Value value;
    private DictionaryNode left;
    private DictionaryNode right;
    private DictionaryNode father;
    
    public DictionaryNode(Key key, Value value) {
        this.key = key;
        this.value = value;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public DictionaryNode getLeft() {
        return left;
    }

    public void setLeft(DictionaryNode left) {
        this.left = left;
    }

    public DictionaryNode getRight() {
        return right;
    }

    public void setRight(DictionaryNode right) {
        this.right = right;
    }

    public DictionaryNode getFather() {
        return father;
    }

    public void setFather(DictionaryNode father) {
        this.father = father;
    }
    
    
    
}
