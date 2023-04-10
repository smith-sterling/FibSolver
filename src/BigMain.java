import java.math.BigInteger;
import java.util.Scanner;

public class BigMain {
    
    public static void cout(Object o) { System.out.println(o); }
    public static String cin() { return new Scanner(System.in).nextLine(); }
    
    public static void main (String[] args) {
        cout("""
                \nWelcome to Fib Solver 8000! Enter a number, 'n' to get the nth value in the fibonacci sequence!""");
        
        long n;
        BigInteger answer;
        while(true) {
            String s = cin();
            try {
                n = Long.parseLong(s.replaceAll(",", ""));
                answer = BigNumberFibSolver.fib(n);
                cout(String.format("%,d", answer));
                cout("\nEnter another number?");
            } catch (NumberFormatException e) {
                cout("That's not a number!");
            }
        }
    }
    
}
