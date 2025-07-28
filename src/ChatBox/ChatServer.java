package ChatBox;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashSet;
import java.util.Set;

public class ChatServer {
        private static Set<PrintWriter> clientWriters = new HashSet<>();

        public static void main(String[] args) throws IOException {
            ServerSocket serverSocket = new ServerSocket(1234);
            System.out.println("Chat server started...");

            while (true) {
                Socket clientSocket = serverSocket.accept();
                new ClientHandler(clientSocket).start();
            }
        }

        static class ClientHandler extends Thread {
            private Socket socket;
            private PrintWriter out;
            private BufferedReader in;
            private String username;

            public ClientHandler(Socket socket) {
                this.socket = socket;
            }

            public void run() {
                try {
                    in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                    out = new PrintWriter(socket.getOutputStream(), true);

                    username = in.readLine();
                    System.out.println(username + " has connected.");
                    broadcast("👉 " + username + " has joined the chat.");

                    synchronized (clientWriters) {
                        clientWriters.add(out);
                    }

                    String message;
                    while ((message = in.readLine()) != null) {
                        System.out.println(username + ": " + message);
                        broadcast("💬 " + username + ": " + message);
                    }
                } catch (IOException e) {
                    System.out.println(username + " disconnected.");
                } finally {
                    try { socket.close(); } catch (IOException ignored) {}

                    synchronized (clientWriters) {
                        clientWriters.remove(out);
                    }
                    broadcast("👈 " + username + " has left the chat.");
                }
            }

            private void broadcast(String message) {
                synchronized (clientWriters) {
                    for (PrintWriter writer : clientWriters) {
                        writer.println(message);
                    }
                }
            }
        }
    }
