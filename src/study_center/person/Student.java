package study_center.person;

import study_center.Program;

public class  Student extends Person {
    private Program studentProgram;


    public Student(String name, String surname) {
        super(name, surname);
    }

    public Program getStudentProgram() {
        return studentProgram;
    }

    public void setStudentProgram(Program studentProgram) {
        this.studentProgram = studentProgram;
    }
}
