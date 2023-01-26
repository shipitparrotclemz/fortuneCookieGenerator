package com.company;

import java.io.IOException;
import java.net.ServerSocket;

public class Server {

    public static void main(String[] args) throws IOException {
	    // write your code here
        int portNumber = Integer.parseInt(args[0]);
        String cookieFile = args[1];
        ServerSocket server = new ServerSocket(portNumber);
        System.out.println("Fortune Cookie Server Up. Listening at Port " + portNumber + ". Serving cookie file at " + cookieFile);
    }
}
