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
public class StudentTest {
    
    public StudentTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    /*
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
*/
    /**
     * Test of getDOB method, of class Student.
     */
    @org.junit.jupiter.api.Test
    public void testGetDOB() {
        Student marvin = new Student("marvin",21,new LocalDate(1999, 03, 07));
        LocalDate ex = new LocalDate(1999,03,07);
        LocalDate actual = marvin.getDOB();
        assertEquals(ex,actual);
    }

    /**
     * Test of getName method, of class Student.
     */
    @org.junit.jupiter.api.Test
    public void testGetName() {
        Student marvin = new Student("marvin",21,new LocalDate(1999, 03, 07));
        String ex = "marvin";
        String actual = marvin.getName();
        assertEquals(ex,actual);
    }

    /**
     * Test of getAge method, of class Student.
     */
    @org.junit.jupiter.api.Test
    public void testGetAge() {
        Student marvin = new Student("marvin",21,new LocalDate(1999, 03, 07));
        int ex = 21;
        int actual = marvin.getAge();
        assertEquals(ex,actual);
    }

    /**
     * Test of getUsername method, of class Student.
     */
    @org.junit.jupiter.api.Test
    public void testGetUsername() {
        Student marvin = new Student("marvin",21,new LocalDate(1999, 03, 07));
        String ex = "marvin21";
        String actual = marvin.getUsername();
        assertEquals(ex,actual);
    }

    /**
     * Test of getCourses method, of class Student.
     */
    @org.junit.jupiter.api.Test
    public void testGetCourses() {
      Student marvin = new Student("marvin",21,new LocalDate(1999, 03, 07));
      Course csit = new Course("csit",new LocalDate(2020,03, 07),new LocalDate(2024, 03, 07));
      Module prog = new Module("prog");
      //csit.addModule(prog);
      prog.addStudent(marvin);
      csit.addModule(prog);
     // marvin.addCourse(csit);
     
        String ex = "[csit]";
        String actual = marvin.getCourses();
        assertEquals(ex,actual);
    }

    /**
     * Test of getModules method, of class Student.
     */
    @org.junit.jupiter.api.Test
    public void testGetModules() {
        Student marvin = new Student("marvin",21,new LocalDate(1999, 03, 07));
      Module prog = new Module("prog");
      //csit.addModule(prog);
      prog.addStudent(marvin);
      
     
        String ex = "[prog]";
        String actual = marvin.getModules();
        assertEquals(ex,actual);
    }

    /**
     * Test of toString method, of class Student.
     */
    @org.junit.jupiter.api.Test
    public void testToString() {
        Student marvin = new Student("marvin",21,new LocalDate(1999, 03, 07));
        String ex = "marvin";
        String actual = marvin.toString();
        assertEquals(ex,actual);
    }
    
}
