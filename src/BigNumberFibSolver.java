import java.math.BigInteger;

public class BigNumberFibSolver {
    public static BigInteger fib(long n) {
        if (n <= 0) {
            return BigInteger.ZERO;
        }
        BigInteger[][] base = {{BigInteger.ONE, BigInteger.ONE}, {BigInteger.ONE, BigInteger.ZERO}};
        BigInteger[][] res = {{BigInteger.ONE, BigInteger.ZERO}, {BigInteger.ZERO, BigInteger.ONE}};
        while (n > 0) {
            if (n % 2 == 1) {
                res = multiply(res, base);
            }
            n /= 2;
            base = multiply(base, base);
        }
        return res[1][0];
    }
    
    private static BigInteger[][] multiply(BigInteger[][] a, BigInteger[][] b) {
        BigInteger[][] c = new BigInteger[2][2];
        c[0][0] = a[0][0].multiply(b[0][0]).add(a[0][1].multiply(b[1][0]));
        c[0][1] = a[0][0].multiply(b[0][1]).add(a[0][1].multiply(b[1][1]));
        c[1][0] = a[1][0].multiply(b[0][0]).add(a[1][1].multiply(b[1][0]));
        c[1][1] = a[1][0].multiply(b[0][1]).add(a[1][1].multiply(b[1][1]));
        return c;
    }
}
