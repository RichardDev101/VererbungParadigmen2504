package de.neuefische.Model;

public class BiologyStudent extends Student {
    //FIELDS
    String testObject;


    @Override
    public String toString() {
        return "BiologyStudent{" +
                "testObject='" + testObject + '\'' +
                ", id='" + getId() + '\'' +
                ", name='" + getName() + '\'' +
                ", subject='" + getSubject() + '\'' +
                '}';
    }


    //CONSTRUCTOR
    public BiologyStudent(String id, String name, String subject, String testObject) {
        super(id, name, subject);
        this.testObject = testObject;
    }

    public BiologyStudent(String testObject) {
        this.testObject = testObject;
    }

    public BiologyStudent() {
    }
    //GETTER AND SETTER

    public String getTestObject() {
        return testObject;
    }

    public void setTestObject(String testObject) {
        this.testObject = testObject;
    }
}
