package org.student.Utilities;
import org.springframework.stereotype.Component;

@Component
public class DisplayUserCommands
{
    public void listAllOptions(){
        System.out.println("1. Add Student");
        System.out.println("2. Update Student");
        System.out.println("3. Delete Student");
        System.out.println("4. View All Students");

        displayInputCommand();
    }

    public void displayInputCommand(){
        System.out.println("enter your option");
    }

    public void DisplayIdInputCommand(){
        System.out.println("enter student id");
    }

    public void DisplayNameInputCommand(){
        System.out.println("enter student name");
    }
}
