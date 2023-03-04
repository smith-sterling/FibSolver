import java.util.Scanner;

public class Main {
    public static void cout(Object o) { System.out.println(o); }
    public static String cin() { return new Scanner(System.in).nextLine(); }

    public static void main (String[] args) {
        cout("""
                \nWelcome to Fib Solver 2000! Enter a number, 'n' to get the nth value in the fibonacci sequence!
                (or a negative number to quit)""");
        int n;
        long answer = 1;
        while(answer >= 0) {
            String s = cin();
            try {
                n = Integer.parseInt(s);
                if (n < 0) break;
                if (n > 91) {
                    cout("Sorry, that's a little too big for me to handle right now...");
                    cout("Mainly because that number is larger than I can store, but hey");
                    continue;
                }
                answer = FibSolver.fib(n);
                cout(String.format("%,d", answer));
                cout("\nEnter another number?");
            } catch (NumberFormatException e) {
                cout("That's not a number!");
            }
        }
    }
}
