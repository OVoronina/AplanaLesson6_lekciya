package study_center;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Program {
    private Date programStartDate;
    private Date getProgramEndDate;
    private String programName;
    private List<Course> courses = new ArrayList<>();
    private Calendar calendar = Calendar.getInstance();
    SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm");

    public Program(String programStartDate, String programName) {
        format.setLenient(false);
        try {
            this.programStartDate = format.parse(programStartDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        this.programName = programName;
    }

    public Date getProgramStartDate() {
        return programStartDate;
    }

    public String getProgramName() {
        return programName;
    }

    public List<Course> addCoursesToProgram (Course[] currentCourses){
        for (Course course:currentCourses) {
            courses.add(course);
        }
        return courses;
    }
}
