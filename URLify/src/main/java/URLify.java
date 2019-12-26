import java.util.regex.*;

public class URLify {

    public static String URLify(String str, int length) {
        Pattern p = Pattern.compile("[a-zA-Z_0-9]");

        char[] charArray = str.toCharArray();

        int first_char = length-1;
        int arr_pointer = charArray.length-1;

        for(int i=first_char; i>=0; i--) {
            // use true length-1 to find first non-space (char) going reverse

            // move first char to end of char array
            if(Character.toString(charArray[i]).matches("[a-zA-Z_0-9]+")) {

                // Copy value to end of array
                charArray[arr_pointer] = charArray[i];

                // De-increment array pointer
                arr_pointer--;
            }
            else {
                charArray[arr_pointer] = '0';
                arr_pointer--;
                charArray[arr_pointer] = '2';
                arr_pointer--;
                charArray[arr_pointer] = '%';
                arr_pointer--;
            }
        }

        return String.valueOf(charArray);
    }
    public static void main(String[] args) {
        String str1 = "Mr John Smith    ";
        //String str2 = "  Mr%20John%20Smith";

        URLify test = new URLify();
       String ret_str =  test.URLify(str1,13);
       System.out.println(ret_str);

    }
}
