import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) throws IOException {
        try (
                Socket socket = new Socket("localhost", 17177);
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        ) {
            out.println("Artem");
            System.out.println(in.readLine());
        }
    }

}
