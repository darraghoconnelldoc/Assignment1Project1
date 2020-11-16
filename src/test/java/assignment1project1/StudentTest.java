
package assignment1project1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author darra
 */
public class StudentTest {
    
    Student student1 = new Student("John Johnson","19","20/02/2000","CT417, EE453","Electronic Engineering");
    Student student2 = new Student("Tom Thompson","18","09/09/1999","EE445, EE600","Electronic Engineering");
    
    public StudentTest() {
        
    }

    /**
     * Test of getUserName method, of class Student.
     */
    
    @org.junit.jupiter.api.Test
    public void testGetUserName() {
        System.out.print(student1.getUserName()+"   ");
        System.out.print(student2.getUserName()+"   ");
        System.out.print("\n/////////////////\n");
    }

    /**
     * Test of getID method, of class Student.
     */
    
    @org.junit.jupiter.api.Test
    public void testGetID() {
        System.out.print(student1.getID()+"   ");
        System.out.print(student2.getID()+"   ");
        System.out.print("\n/////////////////\n");
    }

    /**
     * Test of getModules method, of class Student.
     */
    
    @org.junit.jupiter.api.Test
    public void testGetModules() {
        System.out.print(student1.getModules()+"   ");
        System.out.print(student2.getModules()+"   ");
        System.out.print("\n/////////////////\n");
    }

    /**
     * Test of getCourses method, of class Student.
     */
    @org.junit.jupiter.api.Test
    public void testGetCourses() {
        System.out.print(student1.getCourses()+"   ");
        System.out.print(student2.getCourses()+"   ");
        System.out.print("\n/////////////////\n");
    }

    /**
     * Test of getDOB method, of class Student.
     */
    
    @org.junit.jupiter.api.Test
    public void testGetDOB() {
        System.out.print(student1.getDOB()+"   ");
        System.out.print(student2.getDOB()+"   ");
        System.out.print("\n/////////////////\n");
    }

    /**
     * Test of toString method, of class Student.
     */
    
    @org.junit.jupiter.api.Test
    public void testToString() {
    }
    
}
