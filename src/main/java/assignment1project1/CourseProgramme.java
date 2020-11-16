package assignment1project1;

import java.util.ArrayList;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;

/**
 *
 * @author darraghoconnell
 */

public class CourseProgramme{
    public int i;
    private String CourseName, newModule;
    private ArrayList <Module> modules;
    private ArrayList <Student> courseStudents;
    private LocalDate StartDate,EndDate;
    
    public CourseProgramme( String coursename, LocalDate startdate, LocalDate enddate){
        CourseName = coursename;
        StartDate= startdate;
        EndDate = enddate;
        modules = new ArrayList<Module>();
        courseStudents = new ArrayList<Student>();
    }
    
    
    public void addModule(Module x){
        modules.add(x);
    }
    
     public void addStudents(Module x){
         courseStudents.addAll(x.getStudents());
    }
   
    public String getModules(){
         return modules.toString();
    }
    
    public String getStudents(){
         return courseStudents.toString();
    }
}

