import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args){
        HashMap<String, String> favouriteFruits = new HashMap<String, String>();

        favouriteFruits.put("Alice", "Apple");
        favouriteFruits.put("Sarah", "Banana");
        favouriteFruits.put("Bob", "Strawberry");

        System.out.println(favouriteFruits.get("Alice"));
        System.out.println(favouriteFruits.size());
        System.out.println(favouriteFruits.containsValue("grape"));
        favouriteFruits.remove("Sarah");
        System.out.println(favouriteFruits.size());
    }
}
