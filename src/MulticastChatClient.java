import java.net.*;
import java.io.*;

public class MulticastChatClient {

    public static void main(String [] args) throws Exception{

        int portNumber = 55623;

        if (args.length >= 1) {
            portNumber = Integer.parseInt(args[0]);
        }

        MulticastSocket chatMulticastSocket = new MulticastSocket(portNumber);

        InetAddress group = InetAddress.getByName("225.4.5.6");

        chatMulticastSocket.joinGroup(group);

        String msg = "";

        System.out.println("Type a message for the server: ");


    }

}
