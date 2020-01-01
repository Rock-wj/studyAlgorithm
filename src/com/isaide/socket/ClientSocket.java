package com.isaide.socket;

import com.sun.org.apache.xerces.internal.util.EntityResolverWrapper;
import com.sun.org.apache.xerces.internal.util.SAX2XNI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

/**
 * ClientSocket
 * 用socket通信写出客户端和服务器的通讯，要求客户端发送数据后可以回显相同的数据
 */
public class ClientSocket {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("localhost",4001);
        PrintStream ps = new PrintStream(s.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br_server = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String temp = br.readLine();
        while (true) {
            ps.println(temp);
            temp = br_server.readLine();
            System.out.println("服务器的信息：" + temp);
            if (temp.equals("stop")) {
                break;
            }
            temp = br.readLine();
        }
        s.close();
        br.close();
        br_server.close();
    }
}
