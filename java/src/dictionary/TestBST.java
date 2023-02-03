package dictionary;

/**
 *
 * @author jose
 */
public class TestBST {
    public static void main(String[] args) {
        BinarySearchTree<String, String> dict = new BinarySearchTree<>();
        
        dict.put("José Flávio", "Alfenas");
        dict.put("Raris", "Mariana");
        dict.put("Legatti", "São Paulo");
        dict.put("Daniele", "Campinas");
        
        System.out.println(dict.get("José Flávio"));
        System.out.println(dict.get("Legatti"));
        System.out.println(dict.get("Raris"));
        System.out.println(dict.get("Daniele"));
        
        dict.remove("José Flávio");
        
        System.out.println(dict.get("José Flávio"));
        
    }
}
