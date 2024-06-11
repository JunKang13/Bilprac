package com.kj.test9;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TestServer {
    public static void main(String[] args) throws IOException {
        System.out.println("Server Start...");
        ServerSocket serverSocket = new ServerSocket(8888);
        Socket socket = serverSocket.accept();
        // 获取输入流
        InputStream is = socket.getInputStream();
        DataInputStream dis = new DataInputStream(is);

        // 获取输出流
        String msg = dis.readUTF();
        System.out.println("收到客户端消息：" + msg);

        // 回复客户端
        OutputStream os = socket.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        dos.writeUTF("Hello Received! I'm Server! Bye!");


        // 关闭资源
        dos.close();
        os.close();
        dis.close();
        is.close();
        socket.close();
        serverSocket.close();
    }
}
