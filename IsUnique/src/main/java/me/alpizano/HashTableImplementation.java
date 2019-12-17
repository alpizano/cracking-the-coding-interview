package me.alpizano;

import java.util.Hashtable;

public class HashTableImplementation {
    public static boolean isUnique(String s) {
        Hashtable<String, Integer> table = new Hashtable<>();

        for(int i=0; i< s.length() ; i++) {
            if(table.containsKey(Character.toString(s.charAt(i)))) {
                return false;
            }
            else {
                table.put(Character.toString(s.charAt(i)), i);
            }
        }

//        for (String key : table.keySet()) {
//
//        }
        return true;
    }
    public static void main(String[] args) {
        String notUnique = "I go to eat fudge";
        String Unique = "abcdefghijklmnopqrstuvwxyz";

        System.out.println(HashTableImplementation.isUnique(notUnique));
        System.out.println(HashTableImplementation.isUnique(Unique));
    }
}
