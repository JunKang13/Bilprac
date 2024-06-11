package com.kj.test9;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TestClient {
    public static void main(String[] args) throws IOException {
        System.out.println("Client Start...");
        Socket socket = new Socket("192.168.1.153", 8888);
        // 发送数据
        OutputStream os = socket.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        dos.writeUTF("Hello, Server!");

        // 接受回复
        InputStream is = socket.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        String reply = dis.readUTF();
        System.out.println("收到服务端消息：" + reply);

        // 关闭连接
        dos.close();
        os.close();
        socket.close();
    }
}
