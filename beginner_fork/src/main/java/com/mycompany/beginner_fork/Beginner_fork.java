package com.mycompany.beginner_fork;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author ijc19
 */
public class Beginner_fork {

    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8082);
        System.out.println("Listening for connection on port 8082 ....");
        while (true) {
            try (Socket socket = server.accept()) {
                Date today = new Date();
                String httpResponse = "HTTP/1.1 200 OK\r\n\r\n" + today;
                socket.getOutputStream().write(httpResponse.getBytes("UTF-8"));
            }
                
            }
        }
    }

