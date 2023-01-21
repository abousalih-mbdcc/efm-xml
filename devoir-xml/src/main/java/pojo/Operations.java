package pojo;

import jakarta.xml.bind.annotation.*;
import pojo.Operation;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Operations {

    @XmlAttribute
    private Date dateDebut;
    @XmlAttribute
    private Date dateFin;

    @XmlElement(name = "operation")
    private List<Operation> operationList=new ArrayList<>();

    public Operations() {
    }

    public Operations(Date dateDebut, Date dateFin) {
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
    }

    public Operations(Date dateDebut, Date dateFin, List<Operation> operationList) {
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.operationList = operationList;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public List<Operation> getOperationList() {
        return operationList;
    }

    public void setOperationList(List<Operation> operationList) {
        this.operationList = operationList;
    }
}
