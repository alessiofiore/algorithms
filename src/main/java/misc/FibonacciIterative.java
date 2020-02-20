package misc;

public class FibonacciIterative {

    public static void main(String[] args) {
        System.out.println(fib(6));
    }

    private static int fib(int n) {
        if(n == 0)
            return 0;
        if(n == 1)
            return 1;

        int fn1 = 1;
        int fn0 = 0;
        int fib = 0;
        int i = 2;
        while(i <= n) {
            fib = fn1 + fn0;
            fn0 = fn1;
            fn1 = fib;
            i++;
        }
        return fib;
    }
}
