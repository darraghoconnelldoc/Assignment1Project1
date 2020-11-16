/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates

 */
package assignment1project1;

import java.lang.Math;

/**
 *
 * @author darragh oconnell
 */
public class Student {
    //Name, Age, DOB, ID,username, courses and modules registered for,
    private String Name, Age, DOB, Username, username, Courses, Modules;
    private double ID;
    
    
    public Student (String name, String age, String dob, String modules, String courses ){
        Name = name;
        Age = age;
        DOB = dob;
        Courses = courses;
        Modules = modules;
        
        ID = (999999)*Math.random();
        Username = getUserName();
    }
    
    
    public String getUserName(){
        username = Name.concat(Age);
        return username;
    }   
    
    public double getID(){
        return ID;
    }  
    
    public String getModules(){
        return Modules;
    }
    
     public String getCourses(){
        return Courses;
    }
    
       public String getDOB(){
        return DOB;
    }
       
    @Override
    public String toString(){
        return "///////////\n" + "User Name = " + Username + "\n Student ID = " + ID + "\n";  
    }
}

