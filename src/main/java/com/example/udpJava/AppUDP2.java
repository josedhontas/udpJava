package com.example.udpJava;

import java.net.*;
public class AppUDP2 {
    public static void main(String[] args) throws SocketException {
        try{
            System.out.println("[Alocando porta ......................");
            DatagramSocket socket = new DatagramSocket(5000);
            System.out.println("[Ok]");

            byte[] buf = new byte[20];
            DatagramPacket pack = new DatagramPacket(buf, buf.length);

            System.out.println("[Aguardando recebimento de mensagem ........]");
            socket.receive(pack);

            byte[] received_data = pack.getData();
            String received_msg = new String(received_data);
            InetAddress origin_adess = pack.getAddress();
            int origin_port = pack.getPort();

            System.out.println("  Mensagem: "+ received_msg);
            System.out.println("Endereco de origem: "+ origin_adess);
            System.out.println("Porta de origem :" + origin_port);

        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
