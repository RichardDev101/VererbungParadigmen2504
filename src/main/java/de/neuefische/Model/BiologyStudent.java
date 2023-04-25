package de.neuefische.Model;

public class BiologyStudent extends Student implements Citizen {
    //FIELDS
    String testObject;

    //IMPLEMENTED METHODS
    @Override
    public String getAddress() {
        return super.getAddress();
    }

    @Override
    public int getIdentityCardNumber(){
        return super.getIndentityCardNumber();
    }

    @Override
    public String toString() {
        return "BiologyStudent{" +
                "testObject='" + testObject + '\'' +
                "} " + super.toString();
    }


    //CONSTRUCTOR
    public BiologyStudent(String id, String name, String subject, String address, int identityCardNumber, String testObject) {
        super(id, name, subject, address, identityCardNumber);
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
