package com.alpizano;


import java.util.Hashtable;


public class HashTableImplementation {
    public static boolean checkPermutation(String str1, String str2) {
        Hashtable<Character,Integer> table = new Hashtable<>();

        // if not same length, can't be permutation
        if (str1.length() != str2.length()) {
            return false;
        }

        // put all values of str1 into hashtable
        for (int i = 0; i < str1.length(); i++) {
                table.put(str1.charAt(i), i);
            }



        for(int j=0; j < str2.length(); j++) {
            if(!table.containsKey(str2.charAt(j))) {
                return false;
            }
        }

        return true;

    }
    public static void main(String[] args) {
        String str1 = "abcdefg";
        String str2= "gfedcba";
        String str3 = "gecfdab";
        String str4 = "xyzqykl";
        String str5 = "   ";
        String str6 = "nul";
        String str7 = "   ";

        HashTableImplementation table = new HashTableImplementation();
        System.out.println(table.checkPermutation(str1,str2));
        System.out.println(table.checkPermutation(str1,str3));
        System.out.println(table.checkPermutation(str1,str4));
        System.out.println(table.checkPermutation(str5,str6));
        System.out.println(table.checkPermutation(str5,str7));
    }
}
