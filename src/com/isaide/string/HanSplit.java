package com.isaide.string;

public class HanSplit {

    public static void split(String source, int num) throws Exception
    {
        int k = 0;
        String temp = "";
        for (int i = 0; i < source.length(); i++)
        {
            byte[] bytes = (source.charAt(i)+"").getBytes();
            k=k+bytes.length;
            if (k > num)
                break;
            temp = temp + source.charAt(i);
        }
        System.out.println(temp);
    }

    public static void main(String[] args) throws Exception {
        String source = "我ABC汉DEF";
        int num = 6;
        split(source, num);
    }
}
