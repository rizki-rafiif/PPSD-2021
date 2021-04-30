package gg.rizkirafiif;

public class Program3 {
    public static long fib3(int n)
    {
        if(n<=1)
            return n;
        long fib1 = 0;
        long fib2 = 1;
        long result = 0;
        for(int ii = 2; ii<=n; ii++)
        {
            result = fib2 + fib1;
            fib1 = fib2;
            fib2 = result;
        }
        return result;
    }

    public static void main(String[] args) {
        double c = System.nanoTime();
        int a = 50;
        long x = fib3(a);
        System.out.println(x);
        double d = System.nanoTime();
        double hasil = d - c;
        System.out.println(hasil);
    }
}
