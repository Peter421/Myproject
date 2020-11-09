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
import java.util.*;
public class Course {
  public String name;
  public ArrayList<Student> students = new ArrayList();
  public ArrayList<Student> s1 = new ArrayList();
  public ArrayList<Module> modules = new ArrayList();
  public LocalDate SDate;
  public LocalDate EDate;
 
  
  public Course(String name,LocalDate SDate,LocalDate EDaate){
      this.name=name;
      this.SDate=SDate;
      this.EDate=EDate;
      
  }
  
  public String getModules(){
        
        return modules.toString(); 
    }
  
  public void addModule(Module m){
     
      
      modules.add(m);
      
      if(m.courses.contains(this)== false)
      m.courses.add(this);
     
           students.addAll(m.students);
           for(int i=0;i<students.size();i++){
               if (!s1.contains(students.get(i)))
                   s1.add(students.get(i));
               
              if( students.get(i).courses.contains(this) == false)
               students.get(i).courses.add(this);
               
            //m.students.get(i).courses.add(this);
           
     }
   
          
      }
      
  
  
  /* public void addStudent(Student s){
         
       students.add(s);
       s.courses.add(this);
         
        // if(students.contains(s)== false);
      //   s.addCourse(this);
             
     }
*/
    public String getStudents(){
     
        return s1.toString();
    }
     public String toString() {
        return this.name;
    }
     /* public void setStudents(Student s){
         
         students.add(s);
         
     }
*/

    
   
 
}
