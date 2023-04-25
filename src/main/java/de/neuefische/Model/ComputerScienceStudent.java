package de.neuefische.Model;

public class ComputerScienceStudent extends Student implements Citizen {
    //FIELDS
    boolean codJava = true;

    //IMPLEMENTED METHODS
    @Override
    public String getAddress() {
        return super.getAddress();
    }

    @Override
    public int getIdentityCardNumber() {
        return super.getIndentityCardNumber();
    }

    @Override
    public String toString() {
        return "ComputerScienceStudent{" +
                "codJava=" + codJava +
                "} " + super.toString();
    }
    //CONSTRUCTOR
    public ComputerScienceStudent(String id, String name, String subject, String address, int identityCardNumber, boolean codJava) {
        super(id, name, subject, address, identityCardNumber);
        this.codJava = codJava;
    }

    public ComputerScienceStudent(boolean codJava) {
        this.codJava = codJava;
    }

    public ComputerScienceStudent() {
    }

    // GETTER AND SETTER

    public boolean isCodJava() {
        return codJava;
    }

    public void setCodJava(boolean codJava) {
        this.codJava = codJava;
    }


}
