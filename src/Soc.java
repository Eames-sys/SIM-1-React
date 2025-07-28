import javax.sound.sampled.Port;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Soc {
    public static void main(String[] args) throws IOException {
        ServerSocket serversocket = new ServerSocket(1234);
        System.out.println("Client waiting for connection...");

        Socket socket = serversocket.accept();
        System.out.println("Client connected");

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
        String line = in.readLine();

        System.out.println("Server received: " + line);
        out.println("Server received: ");

        in.close();
        out.close();
        socket.close();
        serversocket.close();
    }
}
