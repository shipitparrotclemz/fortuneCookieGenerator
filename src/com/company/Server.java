package com.company;

import java.util.Scanner;

public class Server {

    public static void main(String[] args) {
	    // write your code here
        int portNumber = Integer.parseInt(args[0]);
        System.out.println("Received port number: " + portNumber);
    }
}
