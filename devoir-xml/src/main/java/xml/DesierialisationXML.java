package xml;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import pojo.Operation;
import pojo.Releve;

import java.io.File;

public class DesierialisationXML {
    public static void main(String[] args) throws JAXBException {
        JAXBContext jaxbContext=JAXBContext.newInstance(Releve.class);
        Unmarshaller unmarshaller=jaxbContext.createUnmarshaller();
        Releve releve=(Releve) unmarshaller.unmarshal(new File("releve.xml"));
        System.out.println("**************************");
        System.out.println(releve.toString());
        for (Operation operation:releve.getOperations().getOperationList() ){
            System.out.println(operation.toString());
        }
    }
}
