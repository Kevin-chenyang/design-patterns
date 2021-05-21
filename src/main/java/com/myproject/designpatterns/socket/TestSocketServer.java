package com.myproject.designpatterns.socket;

import lombok.extern.slf4j.Slf4j;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @program design-patterns
 * @description:
 * @author: chenyang
 * @create: 2021/05/20 22:20
 */
@Slf4j
public class TestSocketServer {

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(889);
            Socket socket = serverSocket.accept();

            InputStream inputStream = socket.getInputStream();
            OutputStream outputStream = socket.getOutputStream();

            DataInputStream dataInputStream = new DataInputStream(inputStream);
            DataOutputStream dataOutputStream = new DataOutputStream(outputStream);

            if(dataInputStream.readUTF()!=null){
                log.info("服务端收到了消息："+dataInputStream.readUTF());
                log.info(socket.getInetAddress()+" : "+socket.getPort());
            }

            dataOutputStream.writeUTF("===>>>"+socket.getInetAddress()+" : "+socket.getPort());

            dataInputStream.close();
            dataOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
