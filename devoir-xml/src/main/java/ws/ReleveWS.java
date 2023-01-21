package ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import pojo.Releve;

import java.io.File;

@WebService(serviceName = "ReleveWS")
public class ReleveWS {

    @WebMethod
    public Releve getReleve() throws JAXBException {
        JAXBContext jaxbContext=JAXBContext.newInstance(Releve.class);
        Unmarshaller unmarshaller=jaxbContext.createUnmarshaller();
        return (Releve) unmarshaller.unmarshal(new File("releve.xml"));
    }

}
