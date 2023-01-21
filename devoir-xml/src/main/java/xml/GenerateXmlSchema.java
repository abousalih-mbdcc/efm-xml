package xml;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.SchemaOutputResolver;
import pojo.Releve;

import javax.xml.transform.Result;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;

public class GenerateXmlSchema {
    public static void main(String[] args) throws JAXBException {

        /*try {
            File file = new File("releve.xsd");

            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }*/

        JAXBContext jaxbContext = JAXBContext.newInstance(Releve.class);
        try {
            jaxbContext.generateSchema(new SchemaOutputResolver() {
                @Override
                public Result createOutput(String s, String s1) throws IOException {
                    File file = new File("releve.xsd");

                    if (file.createNewFile()) {
                        System.out.println("File created        ==>" + file.getName());
                    } else {
                        System.out.println("File already exists ==>" + file.getName());
                    }
                    //StreamResult result = new StreamResult(System.out);
                    StreamResult result = new StreamResult(file);
                    result.setSystemId(file.getName());
                    return result;
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
