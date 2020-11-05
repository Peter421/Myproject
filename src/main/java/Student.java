/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author peter
 */
import java.util.ArrayList;
import org.joda.time.*;
import java.util.*;
public class Student {
    
    public  String name;
    public  int age;
    public  int id = 0;
    public  LocalDate DOB;
    public String username;
    public ArrayList<Course> courses = new ArrayList();
    public ArrayList<Module> modules = new ArrayList();

     
    public Student(String name,int age,LocalDate DOB){
        this.name=name;
        this.DOB=DOB;
        this.age=age;
        id++;  
    }
    
 
    public LocalDate getDOB(){
        return DOB;
    }
    
    public String getName(){
        return name;
    }
    
    
    public int getAge(){
        return age;
    }
    
    public String getUsername(){
        username = name+age;
        return username;
    }
    
/*   public void setCourses(Course c){
        
      courses.add(c);
      if(courses.contains(c)== false)
     c.addStudent(this);
    }

   
   public void addModule(Module m){
        
      modules.add(m);
  if(modules.contains(m)== false)
      m.addStudent(this);
  
  courses.addAll(m.courses);
  courses.addAll(m.courses);
  }
   */
    public String getCourses(){
       
        return courses.toString();
    }
  
    public String getModules(){
        
        return modules.toString();
    }
    
    public String toString() {
        return this.name;
    }
     
   
}
