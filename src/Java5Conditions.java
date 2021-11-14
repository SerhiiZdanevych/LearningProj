
/**
 * Condition logic
 * */
public class Java5Conditions {

    public static void main(String[] args) {

        int a = 10;
        int b = 15;
        int c = 15;

        boolean booleanVariable = a > b;  // false
        booleanVariable = a < b;  // true
        booleanVariable = b == c; // true //  == check for equals
        booleanVariable = b >= c;
        booleanVariable = b <= c;
        booleanVariable = b != c; // false


 //  if - keyword ; ( boolean ) if boolean = true then code block in {} will be executed
        if (a > b) {
            System.out.println("Hello World");
        }

        // Logical operators
        // && - logical AND // true AND true = true ; true and false  = false; false AND false = false
        // || - logical OR // true AND true = true ; true and false  = true ; false AND false = false


        if ( a < b && b != c) {
            System.out.println("Hello World");
        } else {
            System.out.println("Wrong Condition !");
        }
    }

}
