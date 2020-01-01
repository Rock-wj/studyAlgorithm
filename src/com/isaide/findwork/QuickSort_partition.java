package com.isaide.findwork;

//快速排序partition实现方法
public class QuickSort_partition {
    public static void main(String args[])
    {
        int a[] = {5,7,1,6,4,8,3,2};
        quicksort(a, 0, a.length-1);
        for(int i=0;i<a.length;i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }

    public static void swap(int a[], int i, int j)
    {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    //划分数组
    public static int partition(int a[], int low, int high)
    {
        int x = a[low];    //将该数组第一个元素设置为比较元素
        int i=low;
        int j=high;
        while(i < j)
        {
            while(i<j && a[j] >= x)
                j--;     //从右至左找到第一个小于比较元素的数
            while(i<j && a[i] <= x)
                i++;     //从左至右找到第一个大于比较元素的数
            /*需要注意的是，这里的j--与i++的顺序不可以调换！
             *如果调换了顺序，i会走过头，以至于将后面较大的元素交换到数组开头*/

            //将大数与小数交换
            if(i!=j)
                swap(a, i, j);
        }
        swap(a, i, low);    //将比较元素交换到期望位置
        return i;     //返回比较元素的位置
    }

    public static void quicksort(int a[], int low, int high)
    {
        if(low < high)
        {
            int i = partition(a, low, high);    //划分数组并获取比较元素的位置
            quicksort(a, low, i-1);     //对比较元素左边进行排序
            quicksort(a, i+1, high);     //对比较元素右边进行排序
        }
    }
}
