package Networking;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class SampleUDPServer {
    public static void main(String[] args) throws Exception {
        DatagramSocket datagramSocket = new DatagramSocket(7749);
        byte[] receiveData = new byte[1024];
        System.out.println("Server is running on port 7749");

        DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
        datagramSocket.receive(receivePacket);
        String message = new String(receivePacket.getData());
        System.out.println("Client message: " + message.trim());
    }
}
