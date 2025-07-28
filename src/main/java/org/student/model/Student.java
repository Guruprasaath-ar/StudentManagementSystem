package org.student.model;
import org.springframework.stereotype.Component;

@Component
public class Student {

    private int rollNo;
    private String Name;

    public Student() {

    }

    public Student(int rollNo, String Name) {
        this.rollNo = rollNo;
        this.Name = Name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public void display(){
        System.out.println("rollNo: " + rollNo + " Name: " + Name);
    }
}
