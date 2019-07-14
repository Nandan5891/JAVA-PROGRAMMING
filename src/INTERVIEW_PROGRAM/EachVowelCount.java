package INTERVIEW_PROGRAM;

import java.util.HashMap;
import java.util.Map;

public class EachVowelCount {
    public static void main(String[] args) {
        String str = "javaessentials";
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        char[] chArray = str.toCharArray();
        for (char c : chArray) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        //Traversing the element
        for(Map.Entry<Character,Integer>entry:map.entrySet())
        {
            if(entry.getKey()=='a' || entry.getKey()=='e'|| entry.getKey()=='i'||entry.getKey()=='o'||entry.getKey()=='u');
            {
                System.out.println(entry.getKey()+ " -->"+entry.getValue());

            }
        }
    }
}
