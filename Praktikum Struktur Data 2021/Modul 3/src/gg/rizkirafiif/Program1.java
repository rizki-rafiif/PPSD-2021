package gg.rizkirafiif;

public class Program1 {
    public static long fib1(long Num){
        if (Num == 0)
            return 0;
        else if (Num == 1)
            return 1;
        else{
            long x = 0;
            long y = 1;
            for(long k =2; k<=Num; k++){
                y = x + y;
                x = y - x;
            }
            return y;
        }
    }
}
