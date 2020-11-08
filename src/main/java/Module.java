/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author peter
 */
import java.util.*;

public class Module {
     String module;
     ArrayList<Student> students = new ArrayList();
     public ArrayList<Course> courses = new ArrayList();
      boolean sw = false;
      Student st = null;
      Course c = null;
   
    public Module(String module){
         this.module = module;
        // setStudents(s);
     }
     
     public void addStudent(Student s){
         st = s;
         c = Course.c;
         if(students.contains(s) != true)
         students.add(s);
  
              s.modules.add(this); 
         
          
         
          s.courses.addAll(courses);
           
          /* if(c != null){
               c.students.add(s);
           }
         */
        
         
     }
     
    /* public void addcts(){
         //int i = Student.id-1;
     
         sw =true;
         addStudent(st);
         
         
     }*/
    
    
     public String getStudents(){
     
        return students.toString();
    }
  /*   
  public void addCourse(Cou c){
       courses.add(c);
       if(courses.contains(c)== false)
       c.addModule(this);
   }
*/
    public String getCourses(){
       
        return courses.toString();
    }
    
   public String toString() {
        return this.module;
    }
  
    
}
