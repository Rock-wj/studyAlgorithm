package com.isaide.file;

import java.io.*;

/**
 * 请写一个程序的读写，要求用两种方式一种是低层流另一种是高层流
 */
public class Untitled1 {
    public static void writeFileChar() throws IOException {
        FileWriter f = new FileWriter("F:\\学习\\1.txt");
        InputStream is = System.in;
        int c = is.read();
        while (((char)c) != 'x') {
            f.write(c);
            c = is.read();
        }
        f.close();
        is.close();
    }

    public static void writeFileString() throws IOException {
        FileWriter f = new FileWriter("F:\\学习\\1.txt");
        BufferedWriter bwr = new BufferedWriter(f);
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String c = bf.readLine();
        while (!c.equals("stop")){
            bwr.write(c+"\r\n");
            c = bf.readLine();
        }
        bwr.close();
        f.close();
        bf.close();
    }

    public static void readFileChar() throws Exception {
        FileReader f = new FileReader("F:\\学习\\1.txt");
        int c = f.read();
        while (c != -1) {
            System.out.println((char)c);
            c = f.read();
        }
        f.close();
    }

    public static void readFileString() throws Exception {
        BufferedReader bf = new BufferedReader(new FileReader("F:\\学习\\1.txt"));
        String c = bf.readLine();
        while (c != null) {
            System.out.println(c);
            c = bf.readLine();
        }
        bf.close();
    }

    public static void main(String[] args) throws Exception {
        readFileString();
        System.out.println("============");
        //readFileChar();
        //System.out.println("============");
    }
}
