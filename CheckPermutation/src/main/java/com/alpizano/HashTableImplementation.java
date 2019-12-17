package com.alpizano;


import java.util.Hashtable;


public class HashTableImplementation {
    public static boolean checkPermutation(String str1, String str2) {
        Hashtable<Character,Integer> table = new Hashtable<>();

        // if not same length, can't be permutation
        if (str1.length() != str2.length()) {
            return false;
        }

        for(int i=0; i < str1.length(); i++) {
            table.put(str1.charAt(i),i);
        }

        for(int j=0; j < str2.length(); j++) {
            if(!table.containsKey(str2.charAt(j))) {
                return false;
            }
        }

        return true;

    }
    public static void main(String[] args) {
        String str1 = "";
        String str2= "";
    }
}
