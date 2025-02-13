package Networking;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class SampleTCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(4953);
        System.out.println("Server is running on port 4953");

        Socket socket = serverSocket.accept();
        System.out.println("Client connected");

        InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String message = bufferedReader.readLine();
        System.out.println("Client message: " + message);

        // Gửi phản hồi đến client
        OutputStream outputStream = socket.getOutputStream();
        PrintWriter printWriter = new PrintWriter(outputStream, true);
        printWriter.println("Hello from server");

        socket.close();
    }
}
