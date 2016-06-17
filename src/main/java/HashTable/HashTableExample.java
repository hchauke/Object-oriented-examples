package HashTable;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableExample {
    public static void main(String[] args) {
        // Create a hash map
        Hashtable balance = new Hashtable();
        Object key; //This allow to be of all type (String, int, double, etc)

        balance.put("Beans", new Double(343.34));
        balance.put("Cakes" , new Double(123.22));
        balance.put("Juice", new Double(100.50));
        balance.put("1A", new Double(123456.123));

        balance.remove("1A"); // remove the element with key Other


        // Show all balances in hash table.
        Enumeration names = balance.keys();

        while (names.hasMoreElements()) {
            key = names.nextElement();
            System.out.println(key + ":  R " + balance.get(key));
        }

    }
}
