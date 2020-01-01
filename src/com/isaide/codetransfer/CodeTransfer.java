package com.isaide.codetransfer;

import java.io.UnsupportedEncodingException;

/**
 * 字符集编码转换
 */
public class CodeTransfer {
    public static void main(String[] args) {
        try {
            String a = new String("中".getBytes("gb2312"),"iso-8859-1");
            String a1 = new String("中".getBytes("iso-8859-1"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
