package xml;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import pojo.Operation;
import pojo.Operations;
import pojo.Releve;
import pojo.TypeOperation;

import java.io.File;
import java.util.Date;

public class SerialisationXML {
    public static void main(String[] args) throws JAXBException {
        JAXBContext jaxbContext=JAXBContext.newInstance(Releve.class);
        Releve releve=new Releve();
        releve.setRib("011112222333344445555666");
        releve.setDateReleve(new Date());
        releve.setSolde(14500);

        Operations operations=new Operations(new Date(),new Date());
        operations.getOperationList().add(new Operation(TypeOperation.CREDIT,new Date(),9000,"Vers espèce"));
        operations.getOperationList().add(new Operation(TypeOperation.DEBIT,new Date(),3400,"Chèque Guichet"));
        operations.getOperationList().add(new Operation(TypeOperation.DEBIT,new Date(),120,"Prélèvement Assurence"));
        operations.getOperationList().add(new Operation(TypeOperation.CREDIT,new Date(),70000,"Virement .."));

        releve.setOperations(operations);
        Marshaller marshaller=jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
        //marshaller.marshal(releve,System.out);
        marshaller.marshal(releve,new File("releve.xml"));
    }
}
