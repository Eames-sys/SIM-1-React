import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ChatClient2 {
    public static void main(String[] args) {
        try{
            Socket socket = new Socket("Localhost", 1234);

            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter writer = new PrintWriter(socket.getOutputStream(),true);

            String clienttMsg, serverMsg = null;
            while(true){
                System.out.println("Youu");
                clienttMsg = console.readLine();
                writer.println(clienttMsg);

                serverMsg = reader.readLine();
                System.out.println("Server received: " + serverMsg);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
