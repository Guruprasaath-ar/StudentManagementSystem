package org.student.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.student.Utilities.DisplayUserCommands;
import org.student.Utilities.UserInputReader;
import org.student.service.StudentService;


@Component
public class StudentManagementService {

    private StudentService studentService;
    private UserInputReader inputReader;
    private DisplayUserCommands displayUserCommands;

    @Autowired
    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    @Autowired
    public void setDisplayUserCommands(DisplayUserCommands displayUserCommands) {
        this.displayUserCommands = displayUserCommands;
    }

    @Autowired
    public void setInputReader(UserInputReader inputReader) {
        this.inputReader = inputReader;
    }

    public void processInput(){
        switch (inputReader.getOption()){
            case 1, 2:
                displayUserCommands.DisplayIdInputCommand();
                inputReader.receiveIdInput();
                inputReader.readLine();
                displayUserCommands.DisplayNameInputCommand();
                inputReader.receiveNameInput();
                break;
            case 3:
                displayUserCommands.DisplayIdInputCommand();
                inputReader.receiveIdInput();
                break;
            case 4:
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
    }

    public void ExecuteInput(Student student){
        switch (inputReader.getOption()){
            case 1:
                studentService.addStudent(student);
                break;
            case 2:
                studentService.updateStudent(student);
                break;
            case 3:
                studentService.deleteStudent(student.getRollNo());
                break;
            case 4:
                studentService.displayAllStudents();
                break;
        }
    }

    public void start(ApplicationContext context){
        while(inputReader.getOption() != -1)
        {
            displayUserCommands.listAllOptions();
            inputReader.receiveInput();
            processInput();
            Student s = (Student) context.getBean(org.student.model.Student.class);
            s.setRollNo(inputReader.getStudentId());
            s.setName(inputReader.getStudentName());
            ExecuteInput(s);
        }
    }
}
