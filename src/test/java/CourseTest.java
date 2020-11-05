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

/**
 *
 * @author peter
 */
public class CourseTest {
    
    public CourseTest() {
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
     * Test of getModules method, of class Course.
     */
    @Test
    public void testGetModules() {
      Course csit = new Course("csit",new LocalDate(2020,03, 07),new LocalDate(2024, 03, 07));
      Module prog = new Module("prog");
      csit.addModule(prog);
      
      String ex = "[prog]";
      String actual = csit.getModules();
      assertEquals(ex,actual);
    }

    /**
     * Test of addModule method, of class Course.
     */
    @Test
    public void testAddModule() {
           Course csit = new Course("csit",new LocalDate(2020,03, 07),new LocalDate(2024, 03, 07));
      Module prog = new Module("prog");
      csit.addModule(prog);
      
      boolean ex = true;
      boolean actual = csit.modules.contains(prog);
      assertEquals(ex,actual);
    }

    /**
     * Test of getStudents method, of class Course.
     */
    @Test
    public void testGetStudents() {
        Student marvin = new Student("marvin",18,new LocalDate(1999, 03, 07));
      
      Course csit = new Course("csit",new LocalDate(2020,03, 07),new LocalDate(2024, 03, 07));
      Module prog = new Module("prog");
       prog.addStudent(marvin);
      csit.addModule(prog);
      
      String ex = "[marvin]";
      String actual = csit.getStudents();
      assertEquals(ex,actual);
    }

    /**
     * Test of toString method, of class Course.
     */
    @Test
    public void testToString() {
        Course csit = new Course("csit",new LocalDate(2020,03, 07),new LocalDate(2024, 03, 07));
        String ex = "csit";
      String actual = csit.toString();
      assertEquals(ex,actual);
    }
    
}
