package com.isaide.file;

import java.io.File;

/**
 * 列出某目录下所有子目录
 */
public class DirectoryFindAll {
    public static void main(String[] args) {
        getFile(new File("F:\\学习"),"\t");
    }

    private static void getFile(File f, String sem) {
        System.out.println(sem+f.getName());
        File f1[] = f.listFiles();
        if (f1.length>=1) {
            for (int i = 0; i < f1.length; i++) {
                if (f1[i].isDirectory()) {
                    getFile(f1[i],sem+"\t");
                }
            }
        }
    }
}
