package testTP0;

import org.apache.xmlrpc.XmlRpcClient;
import org.apache.xmlrpc.XmlRpcException;
import java.util.Vector;

public class Client {
    public static void main(String[] args) {
        try {
            // Connect to the server
            XmlRpcClient server = new XmlRpcClient("http://localhost:8085/RPC2");

            // Example call to a method named "sample.add" on the server
            Vector<Integer> params = new Vector<>();
            params.add(5);
            params.add(3);
            Integer result = (Integer) server.execute("sample.add", params);

            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.err.println("Client: " + e);
        }
    }
}
