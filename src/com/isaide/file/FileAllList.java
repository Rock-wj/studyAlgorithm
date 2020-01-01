package com.isaide.file;

import java.io.File;
import java.util.concurrent.ForkJoinPool;

/**
 * 列出某个目录下的所有文件
 */
public class FileAllList {
    public static void main(String[] args) {
        File f = new File("F:\\学习\\");
        File[] f1 = f.listFiles();
        for (int i = 0; i < f1.length; i++) {
            if (f1[i].isDirectory()){
                System.out.println("dirctory is" + f1[i].getName());
            }else{
                System.out.println("file is" + f1[i].getName());
            }
        }
    }
}
