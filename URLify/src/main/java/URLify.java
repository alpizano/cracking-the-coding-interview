import java.util.regex.*;

public class URLify {

    public static void URLify(String str, int length) {
        Pattern p = Pattern.compile("[a-zA-Z_0-9]");

        char[] charArray = str.toCharArray();

        int arr_placeholder = length-1;
        int char_placeholder = 0;

        for(int i=charArray.length-1; i>=0; i--) {
            if(Pattern.matches(Character.toString(charArray[i]),"[a-zA-Z_0-9]")) {
                //char_placeholder = i;
                System.out.println("Hello");
            }
        }


    }
    public static void main(String[] args) {
        String str1 = "Mr John Smith      ";
        URLify test = new URLify();
        test.URLify(str1,13);

    }
}
