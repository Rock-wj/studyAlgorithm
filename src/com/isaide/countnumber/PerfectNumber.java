package com.isaide.countnumber;

/**
 * 输出10000以内的所有完全数。
 * 1+2+4+7+14=28
 */
public class PerfectNumber {
    public static void main(String[] args) {
        for (int n = 1; n < 1000; n++) {
            int sum = 0;
            String str = "";
            for (int i = 1; i < n; i++) {
                if ( n%i == 0 ) {
                    sum += i;
                    str += (" + " + i);
                }
            }
            if ( sum == n) {
                System.out.println(n + " = " + str);
            }
        }
    }
}
