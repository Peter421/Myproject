
import java.util.ArrayList;
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

//import org.joda.time.*;
public class Test {
    public static void main(String[] args){
       
      Student marvin = new Student("marvin",21 ,new LocalDate(1999, 03, 07));
      Student kelvin = new Student("Kelvin",20 ,new LocalDate(2000, 03, 07));
      Student joanna = new Student("Joanna",18,new LocalDate(2002, 03, 07));
      Student melissa = new Student("melissa",24,new LocalDate(1996, 03, 07));
      Student Frank = new Student("Frank",20,new LocalDate(2000, 03, 07));
      Student Tom = new Student("Tom",19,new LocalDate(2001, 04, 07));
      Student Alan = new Student("Alan",18,new LocalDate(2002, 03, 07));
      Student Joe = new Student("Joe",17,new LocalDate(2003, 03, 07));
      
      Module prog = new Module("prog");
      Module se = new Module("se");
      Module math = new Module("math");
      Module skills = new Module("skills");
      Module modelling = new Module("modelling");
      Module physics = new Module("physics");
      Module ml = new Module("machine learning");
      Module history = new Module("History");
      Module writing = new Module("Writing");
      Module French = new Module("French");
      
      Module bus = new Module("businuess");
      Module ac = new Module("accounting");
    
      
      
     
      history.addStudent(Tom);
      French.addStudent(Tom);
      writing.addStudent(Tom);
      
      history.addStudent(Alan);
      French.addStudent(Alan);
      writing.addStudent(Alan);
      
      history.addStudent(Joe);
      French.addStudent(Joe);
      writing.addStudent(Joe);
      
      prog.addStudent(marvin);
      se.addStudent(marvin);
      math.addStudent(marvin);
      skills.addStudent(marvin);
      modelling.addStudent(marvin);
      physics.addStudent(marvin);
      ml.addStudent(marvin);
     
       prog.addStudent(melissa);
      se.addStudent(melissa);
      math.addStudent(melissa);
      skills.addStudent(melissa);
      modelling.addStudent(melissa);
      physics.addStudent(melissa);
      ml.addStudent(melissa);
      
      bus.addStudent(Frank);
      ac.addStudent(Frank);
      math.addStudent(Frank);
      
      bus.addStudent(joanna);
      ac.addStudent(joanna);
      math.addStudent(joanna);
      
      bus.addStudent(kelvin);
      ac.addStudent(kelvin);
      math.addStudent(kelvin);
      
      Course csit = new Course("Computer Science",new LocalDate(2020,03, 07),new LocalDate(2024, 03, 07));
      Course commerce = new Course("commerce",new LocalDate(2020,03, 07),new LocalDate(2023, 03, 07));
      Course arts = new Course("Arts",new LocalDate(2020,03, 07),new LocalDate(2023, 03, 07));
      
      arts.addModule(writing);
      arts.addModule(French);
      arts.addModule(history);

      csit.addModule(prog);
      csit.addModule(se);
      csit.addModule(math);
      csit.addModule(prog);
      csit.addModule(skills);
      csit.addModule(modelling);
      csit.addModule(physics);
      csit.addModule(ml);
    
     commerce.addModule(math);
     commerce.addModule(bus);
     commerce.addModule(ac);
     
     
      
      
     // marvin.addCourse(csit);
      
   
    ArrayList<Student> students = new ArrayList();
    ArrayList<Course> courses = new ArrayList();
    
    students.add(marvin);
     students.add(kelvin);
      students.add(joanna);
      students.add(Frank);
      students.add(melissa);
      students.add(Alan);
      students.add(Joe);
      students.add(Tom);
      
      courses.add(csit);
      courses.add(commerce);
      courses.add(arts);
      
      System.out.println("Course Details");
      for(int i = 0;i<courses.size();i++){
        System.out.println("Name:" +courses.get(i).toString()+"\t Modules:"+ courses.get(i).getModules() + "\t Students:" + courses.get(i).getStudents());
    }
       System.out.println("\n");
      System.out.println("Student Details");
    for(int i = 0;i<students.size();i++){
        System.out.println("Name:" +students.get(i).getName()+"\t Username:"+ students.get(i).getUsername()+"\t Module(s):"+students.get(i).getModules()+"\t Course(s):"+students.get(i).getCourses());
    }
  
    }
}
