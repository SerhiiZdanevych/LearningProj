
/**
 * 1) Data Types
 * 2) Java memory
 * 3) Type casting
 */
public class Java3DataTypes {

    static String defaultString;

    public static void main(String[] args) {
        // Primitive data Types ( named with keywords )

        // All java types can be signed ( with - )

        boolean bool = false; // 1 bit can be false or true - by default false

        // all numbers data types by default = 0
        byte b = 127; // 1 byte
        char ch = 'a'; // 2 byte
        short sh = 32767; // 2 byte
        int a = 12; // 4 bytes = 2 ^ 32 // 0000 0000 0000 0000
        long l = 121212L; // 8 byte ; 2^64
        float f = 5.555f; // 4 byte
        double d = 12.12; // 8 byte

        // ============================================================

        long l1 = 1465465465465465444L;
        int n = (int) l1; // can cause incorrect result if long > intMax
        System.out.println("n = " + n);

        long l2 = n;  // smaller data types can be assigned to bigger data types

        int i2 = 9 / 10; // = 0
        System.out.println("i2 = " + i2);

        double d1 = 6 / 5; // = 1 :  1) int i = 6/5 2) d1 = i
        double d2 = 19d / 17; //
        System.out.println("d1 = " + d1);
        System.out.println("d2 = " + d2);

        // ========================
        // Reference types

        String name = "Andrii";
        String secondName = "Golets";
        String fullName = name + " " +secondName;
        System.out.println("Full Name : " + fullName);
        String s = a + "";  // if we add empty string "" result will be a string
        String s1 = String.valueOf(a);

        // By default reference types = null
        String emptyString = "";
        boolean result = emptyString == defaultString;
        
        System.out.println(result);

      



    }

}
