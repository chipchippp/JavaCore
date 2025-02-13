package Networking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class SampleURLReader {
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://tayjava.vn");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));

        String inputLine;
        while ((inputLine = bufferedReader.readLine()) != null) {
            System.out.println(inputLine);
        }

        bufferedReader.close();
    }
}
