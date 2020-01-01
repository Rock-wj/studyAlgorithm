package com.isaide.findwork;

public class Fab_Rabbit {
    public static void main(String[] args) {
        int month = 12;
        int sum = fab(month);
        System.out.println(sum);
        System.out.println(fab_1(month));
    }

    private static int fab_1(int n) {
        // TODO Auto-generated method stub
        if(n<=2) return 1;
        else return fab_1(n-1)+fab_1(n-2);
    }

    private static int fab(int month) {
        // TODO Auto-generated method stub
        if(month <= 2){
            return 1;
        }else if(month == 3) {
            return 2;
        }else {
            return 2*fab(month-1)-fab(month-3);
        }
    }
}
