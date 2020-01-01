package com.isaide.findwork;

public class QuickSort_split {
    //快速排序split实现方法
    public static void main(String args[])
    {
        int a[] = {5,7,1,6,4,8,3,2};
        quickSort(a, 0, a.length-1);
        for(int i=0;i<a.length;i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }

    //交换方法
    public static void swap(int a[], int i, int j)
    {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    //划分数组
    public static int split(int a[], int low, int high)
    {
        int i = low;    //i指向比较元素的期望位置
        int x = a[low];    //将该组的第一个元素作为比较元素
        //从第二个元素开始，若当前元素大于比较元素，将其跳过
        for(int j = low+1; j <= high; j++)
        {
            //若找到了小于比较元素的元素，将其与前面较大的元素进行交换
            if(a[j] <= x)
            {
                i++;
                if(i != j)
                    swap(a, i, j);

            }
        }
        swap(a, i, low);     //将比较元素交换到正确的位置上
        return i;    //返回比较元素的位置
    }

    public static void quickSort(int a[], int low, int high)
    {
        if(low < high)
        {
            int i = split(a, low, high);    //划分并获取比较元素的位置
            quickSort(a, low, i-1);     //对比较元素左边的数组进行排序
            quickSort(a, i+1, high);     //对比较元素右边的数字进行排序
        }
    }
}
