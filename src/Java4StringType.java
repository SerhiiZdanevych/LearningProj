import java.util.Locale;

/**
 *  String data type
 */


public class Java4StringType {

    public static void main(String[] args) {

        String s = "Some text";
        int length = s.length();

        System.out.println("length of = " + s.length());

        s = s.toUpperCase();

        System.out.println("To Upper case : " + s);

        s = s.toLowerCase();

        System.out.println("To lower case : " + s);

        int index= s.indexOf("text");

        System.out.println(index);

    }

}
