package Server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main (String[] args) {
        try {
            ServerSocket ss = new ServerSocket(5000); // server socket create
            System.out.println("Server is running");

            while (true) {
                /* connect players */
                Socket player1 = ss.accept(); // wait til connect
                System.out.println("Player1 is connected");

                Socket player2 = ss.accept();
                System.out.println("Player2 is connected");

                /* game start */
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
