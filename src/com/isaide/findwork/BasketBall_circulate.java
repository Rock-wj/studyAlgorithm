package com.isaide.findwork;

import java.util.Scanner;

/**
 * 一个小球从100米空中落下，每次反弹一半高度，小球总共经过多少米，请问第10次反弹的高度是多少
 */
public class BasketBall_circulate {
    public static void main(String[] args) {
        System.out.print("请输入次数N：");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i;
        float s=0,h=50;
        for (i=1; i<=n; i++) {
            if(i == 1) {
                s = 100;//第一次落地
            } else {
                s += h*5/2;
                h = h/2;
            }
        }
        System.out.println("小球第"+n+"次落地时经过的路径是"+s+"米，再弹起时的高度为"+h);
    }
}
