/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 
 */
package assignment1project1;

import java.util.ArrayList;
/**
 *
 * @author darraghoconnell
 */
public class Module {
    
    private String ModuleName, ModuleID, Course, newStudent;
    private ArrayList <Student> moduleStudents;
    
    public Module(String modulename, String moduleID, String course ){
        ModuleName = modulename;
        ModuleID = moduleID;
        Course = course;
        moduleStudents = new ArrayList<Student>();
    }
   
    public void addStudent(Student x){
       moduleStudents.add(x);
    }
    
    public ArrayList getStudents(){
        return moduleStudents;
    }
    
    @Override
    public String toString(){
        return "///////////\n" + "Module Name = " + ModuleName + "\n Module ID = " + ModuleID + "\n";  
    }
    
}
