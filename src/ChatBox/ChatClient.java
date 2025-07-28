package ChatBox;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

    public class ChatClient {
        public static void main(String[] args) {
            try {
                Socket socket = new Socket("localhost", 1234);
                System.out.println("Connected to chat server...");

                BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
                PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

                // Ask for username
                System.out.print("Enter your username: ");
                String username = console.readLine();
                output.println(username); // Send it to the server

                // Thread to listen for messages from server
                new Thread(() -> {
                    String serverMsg;
                    try {
                        while ((serverMsg = input.readLine()) != null) {
                            System.out.println(serverMsg);
                        }
                    } catch (IOException e) {
                        System.out.println("Disconnected from server.");
                    }
                }).start();

                // Main thread: read user input and send
                String userInput;
                while ((userInput = console.readLine()) != null) {
                    output.println(userInput);
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }