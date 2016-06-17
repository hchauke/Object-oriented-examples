package HashMap;

import java.util.*;

public class HashMapExample {

    public static void main(String[] args) {


        HashMap<String, String> keyAndValue = new HashMap();

        keyAndValue.put("A", "Hlulani");
        keyAndValue.put("E", "Chauke");
        keyAndValue.put("C", "Hlulani Chauke");

        keyAndValue.remove("A"); //remove the element with key A


        /**
         * To display all data, you'll need a Set that implement hashMap (Set set = keyAndValue.entrySet()) and
         * an Iterator that implement Set (Iterator iterator = set.iterator())
         * while iterator hasNext element, create Map entry that implement Iterator (Map.Entry entry = (Map.Entry) iterator.next())
         * then entry.getKey()
         * */

        Set set = keyAndValue.entrySet();
        Iterator iterator = set.iterator();

        while (iterator.hasNext()){
            Map.Entry entry = (Map.Entry) iterator.next();

            System.out.print("Keys is: "+ entry.getKey() +" And Values is: ");
            System.out.println(entry.getValue());
        }


    }
}
