public class URLify {

    public static void URLify(String str, int length) {
        char[] charArray = str.toCharArray();

        for(int i=0; i<charArray.length; i++) {
            System.out.println(charArray[i]);
        }


    }
    public static void main(String[] args) {
        String str1 = "Mr John Smith      ";
        URLify test = new URLify();
        test.URLify(str1,13);

    }
}
