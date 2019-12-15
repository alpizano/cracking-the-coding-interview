package me.alpizano;

public class BitVectorImplementation {
    public static boolean isUnique(String str) {
        int checker = 0;
        for (int i=0; i< str.length(); i++) {
            int val = str.charAt(i) - 'a';
            if ((checker & (1 << val)) > 0) {
                return false;
            }
            checker |= (1 << val);
        }
        return true;
    }

    public static void main(String[] args) {

        int val = 'a';

        int shift = 3 << 2;

        System.out.println(val);
        System.out.println(Integer.toBinaryString(shift));
        System.out.println(1 | 3 << 2);

    }



}
