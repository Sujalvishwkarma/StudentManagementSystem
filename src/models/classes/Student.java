package src.models.classes;

import src.models.enums.Role;
import src.models.enums.Academics.Branch;

public class Student extends Person {
    private int StudentId ;
    private Branch Branch ;
    Student(int StudentId,Branch Branch,String name,String address){
        super(name,Role.STUDENT,address);
        this.StudentId = StudentId ; 
        this.Branch = Branch;
    }
}
