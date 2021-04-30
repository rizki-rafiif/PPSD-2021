package gg.rizkirafiif;

public class Program2 {
    public static long fib2(int n){
        if (n<=1)
            return n;
        else return fib2(n-1) + fib2(n-2);
    }
}
