package com.alpizano;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
import java.util.List;

public class SortingComparisonImplementation {


    public static boolean checkPermutation(String str1, String str2) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        //System.out.println(Arrays.asList(str1));
        //System.out.println(Arrays.asList(str2));

        if (str1.length() != str2.length()) {
            return false;
        }
        else {
            for (int i = 0; i < str1.length(); i++) {
                list1.add(Character.toString(str1.charAt(i)));
                list2.add(Character.toString(str2.charAt(i)));
            }

        }
        Collections.sort(list1);
        Collections.sort(list2);

        if( !list1.equals(list2)) {
            return false;
        }
        else {
            return true;
        }
    }

    public static void main(String[] args) {
        String str1 = "test";
        String str2 = "tset";
        String str3 = "teet";

        SortingComparisonImplementation test = new SortingComparisonImplementation();
        System.out.println(test.checkPermutation(str1,str2));
        System.out.println(test.checkPermutation(str1,str3));


    }
}
