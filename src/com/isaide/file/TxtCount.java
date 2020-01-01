package com.isaide.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 写一个程序，从文件（c:\test.txt）中查出字符串”mobnet”出现的次数？
 */
public class TxtCount {
    public static void main(String[] args) throws IOException {
        //读入文本（字符），用FileReader -> BufferedReader
        //读入输入字符（字节），用FileInputStream -> InputStreamReander -> BufferedReader
        BufferedReader br = new BufferedReader(new FileReader("F:\\学习\\1.txt"));
        StringBuilder sb = new StringBuilder();

        while (true){
            String str = br.readLine();
            if (str == null){
                break;
            }
            sb.append(str);
        }
        Pattern p = Pattern.compile("mobnet");
        Matcher m = p.matcher(sb);
        int count = 0;
        while (m.find()){
            count++;
        }
        System.out.println(count);
    }
}
