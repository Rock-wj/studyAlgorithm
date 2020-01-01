package com.isaide.file;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Counter {
    static int count = 0;
    public static void checkAll(File file) {
        if (file.isFile()) {
            if (file.getName().endsWith(".java")) {     //如果是文件再判断是不是java文件
                try (BufferedReader br = new BufferedReader(
                        new FileReader(file));) {
                    String str = null;
                    while ((str = br.readLine()) != null) {     //查询整行代码，用readLine换行处理
                        if (!str.trim().equals(""))     //去掉无代码的空行
                            count++;
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println(" "+file.getName());
            }
        } else if(file.isDirectory()){
            File[] files = file.listFiles();//如果是目录，就遍历目录下的所以目录或文件
            for (File f : files) {
                checkAll(f);
                ////System.out.println(f.getName());
            }
        }
    }
    public static void main(String[] args) {
        File file = new File("F:\\学习");
        checkAll(file);
        System.out.println("共"+count+"行代码");

    }
}

