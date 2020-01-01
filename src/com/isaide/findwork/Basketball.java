package com.isaide.findwork;

import java.util.Scanner;

/**
 * 一个小球从100米空中落下，每次反弹一半高度，小球总共经过多少米，请问第10次反弹的高度是多少
 */
public class Basketball {
    private static int NUMBER = 1;//小球下落次数

    public static void main(String[] args) {
        System.out.print("请输入第几次：");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        recurrence(n,100,50);//初始值（recurrence递归）
    }

    public static void recurrence(int n, float s, float h) {
        if (n > 1){
            NUMBER++;
            recurrence(n-1,s+h*5/2,h/2);
        }else {
            System.out.println("小球第"+NUMBER+"次落地时经过的路径是"+s+"米，再弹起时的高度为"+h);
        }
    }
}
