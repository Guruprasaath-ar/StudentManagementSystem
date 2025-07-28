package org.student.Utilities;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class UserInputReader {
    private final Scanner scan;
    @Value("0")
    private int option;
    private int studentId;
    private String studentName;

    public UserInputReader() {
        scan = new Scanner(System.in);
    }

    public int getOption() {
        return option;
    }

    public void setOption(int option) {
        this.option = option;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void receiveInput(){
        option = scan.nextInt();
    }

    public void receiveIdInput(){
        studentId = scan.nextInt();
    }

    public void receiveNameInput(){
        System.out.println("enter student name");
        studentName = scan.next();
    }

    public void readLine(){
        scan.nextLine();
    }
}
