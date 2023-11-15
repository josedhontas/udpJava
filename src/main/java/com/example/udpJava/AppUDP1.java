package com.example.udpJava;

import java.net.*;

public class AppUDP1{
    public static void main(String[] args) throws SocketException{
        try{
            System.out.println("[Alocando porta UDP ....................... ");
            DatagramSocket socket = new DatagramSocket(3000);
            System.out.println("[Ok]");

            String msg = "Oi";

            byte[] msg_buf = msg.getBytes();
            int msg_size = msg_buf.length;
            InetAddress destination_address = InetAddress.getLocalHost();
            int destination_port = 5000;

            System.out.println("[Montando datagrama UDP ....................]");
            DatagramPacket pack = new DatagramPacket(msg_buf, msg_size, destination_address, destination_port);
            System.out.println("[Ok]");
            socket.send(pack);
            System.out.println("[Ok]");

        } catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}