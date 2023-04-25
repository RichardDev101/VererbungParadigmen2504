package de.neuefische.Model;

public class Student {
    //FIELDS
    private String id;
    private String name;
    private String subject;
    private String address;
    private int identityCardNumber;


    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                ", address='" + address + '\'' +
                ", identityCardNumber=" + identityCardNumber +
                '}';
    }

    // KONSTRUKTOR
    public Student(String id, String name, String subject, String address, int identityCardNumber) {
        this.id = id;
        this.name = name;
        this.subject = subject;
        this.address=address;
        this.identityCardNumber=identityCardNumber;
    }

    public Student() {
    }

    // GETTER & SETTER

    public int getIndentityCardNumber() {
        return identityCardNumber;
    }

    public void setIndentityCardNumber(int indentityCardNumber) {
        this.identityCardNumber = indentityCardNumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
