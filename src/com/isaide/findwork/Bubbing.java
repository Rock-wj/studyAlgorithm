package com.isaide.findwork;

/**
 * 冒泡排序
 */
public class Bubbing {
    public static void main(String[] args) {
        int[] a = {8,7,9,8,1,1,0,4,3,6,1};
        int i,j;
        for (i=0; i<a.length; i++) {
            for (j=0; j<a.length-i-1; j++) {
                if (a[j] > a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        System.out.println("从小到大排序的结果是：");
        for (i=0; i<a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
