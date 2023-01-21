package pojo;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import pojo.Operations;

import java.util.Date;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Releve {
    @XmlAttribute
    private String rib;
    private Date dateReleve;
    private double solde;
    private Operations operations;

    @Override
    public String toString() {
        return "Releve\n" +
                "\trib='" + rib + "\n" +
                "\tdate Releve=" + dateReleve.toLocaleString() +"\n" +
                "\tsolde=" + solde+"\n" +
                "\nLes pojo.Operations:" ;
    }

    public Releve() {
    }

    public String getRib() {
        return rib;
    }

    public void setRib(String rib) {
        this.rib = rib;
    }

    public Date getDateReleve() {
        return dateReleve;
    }

    public void setDateReleve(Date dateReleve) {
        this.dateReleve = dateReleve;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Operations getOperations() {
        return operations;
    }

    public void setOperations(Operations operations) {
        this.operations = operations;
    }
}
