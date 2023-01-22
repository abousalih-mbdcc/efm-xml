import proxy.*;

public class ClientWS {
    public static void main(String[] args) throws JAXBException_Exception {
        ReleveService stub=new ReleveWS().getReleveServicePort();
        Releve releve=stub.getReleve();
        System.out.println(getDescriptReleve(releve));
        for (Operation operation:releve.getOperations().getOperation() ){
            System.out.println(getDescriptOperation(operation));
        }
    }

    public static String getDescriptReleve(Releve releve) {
        return "Releve\n" +
                "\trib=" + releve.getRib() + "\n" +
                "\tdate Releve=" + releve.getDateReleve() +"\n" +
                "\tsolde=" + releve.getSolde()+"\n" +
                "\nLes Operations:" ;
    }
    public static String getDescriptOperation(Operation operation) {
        return "\tOperation[" +
                "type=" + operation.getType() +
                ", date=" + operation.getDate() +
                ", montant=" + operation.getMontant() +
                ", description='" + operation.getDescription() + '\'' +
                ']';
    }
}
