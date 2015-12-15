/**
 *The Client connects to the server with port 1099
 *Gets a response connection successfully else and error returns
 *Clients sends a message and receives a response
 * @author Daniel Mutwiri
 * @follow https://www.twitter.com/danielmutwiri
 */
package rmiclient;

import java.rmi.registry.*;

public class RMIClient {

    public static void main(String[] args) {
        RMIClient client = new RMIClient();
        client.connectServer();
    }

    private void connectServer() {
        try {
            Registry reg = LocateRegistry.getRegistry("127.0.0.1", 1099);
            RMI rmi = (RMI) reg.lookup("server");
            System.out.println("Connect to server");
            String text = rmi.getData("Daniel");
            System.out.println(text);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private static class RMI {

        public RMI() {
        }
    }

}
