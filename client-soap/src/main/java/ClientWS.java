import proxy.JAXBException_Exception;
import proxy.ReleveService;
import proxy.ReleveWS;

public class ClientWS {
    public static void main(String[] args) throws JAXBException_Exception {
        ReleveService stub=new ReleveWS().getReleveServicePort();
        System.out.println(stub.getReleve());
    }
}
