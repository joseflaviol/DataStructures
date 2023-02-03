package dictionary;

import utils.DictionaryNode;

/**
 *
 * @author jose
 */
public class BinarySearchTree<Key extends Comparable<Key>, Value> implements Dictionary<Key, Value> {
    
    private DictionaryNode root;
    
    public BinarySearchTree() {
        root = null;
    }
    
    public Value get(Key key) {
        int cmp;
        DictionaryNode x = root;
        
        while (x != null && key != x.getKey()) {
            cmp = x.getKey().compareTo(key);
            if (cmp > 0) {
                x = x.getLeft();
            } else {
                x = x.getRight();
            }
        }
        
        if (x == null) {
            return null;
        }
        
        return (Value) x.getValue();
    }
    
    private DictionaryNode getDNode(Key key) {
        int cmp;
        DictionaryNode x = root;
        
        while (x != null && key != x.getKey()) {
            cmp = x.getKey().compareTo(key);
            if (cmp > 0) {
                x = x.getLeft();
            } else {
                x = x.getRight();
            }
        }
        
        return x;
    }
    
    public void put(Key key, Value value) {
        
        DictionaryNode y = null;
        DictionaryNode x = this.root;
        
        while (x != null) {
            y = x;
            
            int cmp = x.getKey().compareTo(key);
            
            if (cmp > 0) {
                x = x.getLeft();
            } else if (cmp < 0) {
                x = x.getRight();
            } else {
                x.setValue(value);
                return;
            }
        }
        
        DictionaryNode z = new DictionaryNode(key, value);
        z.setFather(y);
        
        if (y == null) {
            this.root = z;
        } else {
            int cmp = y.getKey().compareTo(z.getKey());
            
            if (cmp > 0) {
                y.setLeft(z);
            } else {
                y.setRight(z);
        
            }
        }
    }
    
    private DictionaryNode treeMinimum(DictionaryNode x) {
        while (x.getLeft() != null) {
            x = x.getLeft();
        }
        
        return x;
    }
    
    private void transplant(DictionaryNode u, DictionaryNode v) {
        if (u.getFather() == null) {
            this.root = v;
        } else if (u == u.getFather().getLeft()) {
            u.getFather().setLeft(v);
        } else {
            u.getFather().setRight(v);
        }
        
        if (v != null) {
            v.setFather(u.getFather());
        }
    }
    
    public void remove(Key key) {
        DictionaryNode z = this.getDNode(key);
        
        if (z != null) {
            
            if (z.getLeft() == null) {
                this.transplant(z, z.getRight());
            } else if (z.getRight() == null) {
                this.transplant(z, z.getLeft());
            } else {
                DictionaryNode y = this.treeMinimum(z.getRight());
                
                if (y.getFather() != z) {
                    this.transplant(y, y.getRight());
                    y.setRight(z.getRight());
                    y.getRight().setFather(y);
                }
                
                this.transplant(z, y);
                y.setLeft(z.getLeft());
                y.getLeft().setFather(y);
            }
            
        }
    }
    
}
