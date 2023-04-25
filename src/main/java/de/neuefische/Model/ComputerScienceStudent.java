package de.neuefische.Model;

public class ComputerScienceStudent extends Student {
    //FIELDS
    boolean codJava = true;


    @Override
    public String toString() {
        return "ComputerScienceStudent{" +
                "codJava=" + codJava +
                ", id='" + getId() + '\'' +
                ", name='" + getName() + '\'' +
                ", subject='" + getSubject() + '\'' +
                '}';
    }

    // CONSTRUCTOR
    public ComputerScienceStudent(String id, String name, String subject, boolean codJava) {
        super(id, name, subject);
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
