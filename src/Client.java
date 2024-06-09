import java.io.IOException;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        String serverIP = "localhost";
        Socket soc;

        try {
            soc = new Socket(serverIP, 5000);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}