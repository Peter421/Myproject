
import org.joda.time.LocalDate;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author peter
 */
import org.joda.time.*;
public class Test {
    public static void main(String[] args){
       
      Student marvin = new Student("marvin",18,new LocalDate(1999, 03, 07));
      
      Course csit = new Course("csit",new LocalDate(2020,03, 07),new LocalDate(2024, 03, 07));
      Module prog = new Module("prog");
      //csit.addModule(prog);
      prog.addStudent(marvin);
      csit.addModule(prog);
     // marvin.addCourse(csit);
      
      
      System.out.println(csit.getModules());
     System.out.println(csit.getStudents());
     
      System.out.println(marvin.getCourses());
      System.out.println(prog.getCourses());
      System.out.println(prog.getStudents());
      
      
      
       
      System.out.println(marvin.getModules());
      //^System.out.println(csit.getModules());
 
      
       
    }
}
