package com.isaide.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ServerSocket
 * 用socket通信写出客户端和服务器的通讯，要求客户端发送数据后可以回显相同的数据
 */
public class ServerSocket_1 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(4001);
        Socket s = ss.accept();
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintStream ps = new PrintStream(s.getOutputStream());
        String temp = br.readLine();
        while (true) {
            System.out.println("客户端：" + temp);
            ps.println(temp);
            if (temp.equals("stop")) {
                break;
            }
            temp = br.readLine();
        }
        br.close();
        ps.close();
        ss.close();
    }
}

