package de.neuefische.Model;

public class Student {
    //FIELDS
    private String id;
    private String name;
    private String subject;


    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }

    // KONSTRUKTOR
    public Student(String id, String name, String subject) {
        this.id = id;
        this.name = name;
        this.subject = subject;
    }

    public Student() {
    }

    // GETTER & SETTER
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
}
