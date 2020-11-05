/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.joda.time.LocalDate;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

/**
 *
 * @author peter
 */
public class ModuleTest {
    
    public ModuleTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of addStudent method, of class Module.
     */
    @Test
    public void testAddStudent() {
        Student marvin = new Student("marvin",18,new LocalDate(1999, 03, 07));
        Module prog = new Module("prog");
        
      prog.addStudent(marvin);
     boolean ex = true;
     boolean actual = prog.students.contains(marvin);
     assertEquals(ex,actual);
      
      
    }

   
   
    /**
     * Test of getStudents method, of class Module.
     */
    @Test
    public void testGetStudents() {
        Student marvin = new Student("marvin",18,new LocalDate(1999, 03, 07));
        Module prog = new Module("prog");
        
      prog.addStudent(marvin);
     String ex = "[marvin]";
     String actual = prog.getStudents();
     assertEquals(ex,actual);
        
    }

    /**
     * Test of getCourses method, of class Module.
     */
    @Test
    public void testGetCourses() {
       Course csit = new Course("csit",new LocalDate(2020,03, 07),new LocalDate(2024, 03, 07));
      Module prog = new Module("prog");
      csit.addModule(prog);
      
      String ex = "[csit]";
      String actual = prog.getCourses();
     assertEquals(ex,actual);
    }

    /**
     * Test of toString method, of class Module.
     */
    @Test
    public void testToString() {
        Module prog = new Module("prog");
        String ex = "prog";
        String actual = prog.toString();
        assertEquals(ex,actual);
        
    }
    
}
