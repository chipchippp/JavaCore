package Networking;

import java.io.*;
import java.net.Socket;

public class SampleTCPClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 4953);
//        kết nối đến server ở cổng 4999

//        gửi dữ liệu đến server
        OutputStream outputStream = socket.getOutputStream();
        PrintWriter printWriter = new PrintWriter(outputStream, true);
        printWriter.println("Hello from client");

//        nhận phan hồi từ server
        InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String response = bufferedReader.readLine();
        System.out.println("Server response: " + response);

        socket.close();

    }
}
