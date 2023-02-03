package dictionary;

/**
 *
 * @author jose
 */
public interface Dictionary<Key extends Comparable<Key>, Value> {
    
    Value get(Key key);
    
    void put(Key key, Value value);
    
    void remove(Key key);
    
}
