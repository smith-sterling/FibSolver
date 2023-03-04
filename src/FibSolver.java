public class FibSolver {
    public static long fib(int n) {
        if (n <= 0) {
            return 0;
        }
        long[][] base = {{1, 1}, {1, 0}};
        long[][] res = {{1, 0}, {0, 1}};
        while (n > 0) {
            if (n % 2 == 1) {
                res = multiply(res, base);
            }
            n /= 2;
            base = multiply(base, base);
        }
        return res[1][0];
    }

    private static long[][] multiply(long[][] a, long[][] b) {
        long[][] c = new long[2][2];
        c[0][0] = a[0][0] * b[0][0] + a[0][1] * b[1][0];
        c[0][1] = a[0][0] * b[0][1] + a[0][1] * b[1][1];
        c[1][0] = a[1][0] * b[0][0] + a[1][1] * b[1][0];
        c[1][1] = a[1][0] * b[0][1] + a[1][1] * b[1][1];
        return c;
    }

}
