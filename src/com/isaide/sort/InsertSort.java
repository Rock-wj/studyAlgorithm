package com.isaide.sort;

import java.util.ArrayList;
import java.util.Random;

/**
 * 用ArrayList动态初始化数组，实现插入排序
 */
public class InsertSort {

    ArrayList a1;

    public InsertSort(int num, int mod)
    {
        a1 = new ArrayList(num);
        Random random = new Random();
        System.out.println("The ArrayList Sort Before:");
        for (int i = 0; i < num; i++)
        {
            a1.add(new Integer(Math.abs(random.nextInt())%mod+1));
            System.out.println("a1["+i+"]="+a1.get(i));
        }
    }

    public void SortIt()
    {
        Integer tempInt;
        int MaxSize = 1;
        for (int i = 1; i < a1.size(); i++)
        {
            tempInt = (Integer) a1.remove(i);
            if (tempInt.intValue() >= ((Integer)a1.get(MaxSize-1)).intValue())
            {
                a1.add(MaxSize,tempInt);
                MaxSize++;
                System.out.println(a1.toString());
            } else {
                for (int j = 0; j < MaxSize; j++)
                {
                    if (((Integer)a1.get(j)).intValue() >= tempInt.intValue())
                    {
                        a1.add(j,tempInt);
                        MaxSize++;
                        System.out.println(a1.toString());
                        break;
                    }
                }
            }
        }
        System.out.println("The ArrayList Sort After:");
        for (int i = 0; i < a1.size(); i++)
        {
            System.out.println("a1["+i+"]="+a1.get(i));
        }
    }

    public static void main(String[] args) {
        InsertSort insertSort = new InsertSort(10, 100);
        insertSort.SortIt();
    }
}
