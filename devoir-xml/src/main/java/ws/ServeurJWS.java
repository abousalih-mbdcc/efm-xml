package ws;

import jakarta.xml.ws.Endpoint;

public class ServeurJWS {
    public static void main(String[] args) {
        Endpoint.publish("http://0.0.0.0:9494/",new ReleveService());
        System.out.println("Web service deploy sur http://0.0.0.0:9494/");
    }
}
