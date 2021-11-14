
/**
 * 1) Variables
 * 2) Operators
 */

public class Java2Variables {
    static int b; // class level variable

    public static void main(String[] args) {

        int a = 10; // int - DataType ; a - variable ; 10 - value assigned to the variable;
        b = 15;
        b = a;
        b = b + 10;
        b += 10; // equal : b = b + 10;
        b -= 10;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Increment and decrement operators

        int i = 1;
        // int i1 = i++; // 1) i1 = i 2) i = i + 1
        int i1 = i;
        i = i + 1;
        System.out.println("i1 =  " + i1);
        int i2 = i;  // i = 2
        System.out.println("i2 =  " + i2);

        // complex expressions

        int complexResult = i + i1 * (15 + 25 - 4) / (b ^ 2);

        int sqrt = (int) Math.sqrt(4);
        System.out.println("complexResult = " + complexResult);

        int a2 , b4, c3;

        a2 = 25;

    }
}
