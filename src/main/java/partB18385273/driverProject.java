/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package partB18385273;
import java.util.ArrayList;
import partA18385273.Course;
import partA18385273.Student;
import partA18385273.Module;
import org.joda.time.LocalDate;

/**
 *
 * @author darrenbrowne
 */
public class driverProject {
    
    public driverProject(){}
    
    public void testAll(){
        Course testCourse, testCourse2;
        ArrayList<Student> students;
        ArrayList<Module> modules;
        LocalDate start, end;
        
        ArrayList<Module> emptyModules = new ArrayList<>();
        ArrayList<Course> emptyCourses  = new ArrayList<>();
        ArrayList<Student> emptyStudents = new ArrayList<>();
        
        modules = new ArrayList<>(3);
        Module testModule1 = new Module("CT144", 4506, emptyStudents, emptyCourses);
        Module testModule2 = new Module("CT145", 4507, emptyStudents, emptyCourses);
        Module testModule3 = new Module("CT146", 4508, emptyStudents, emptyCourses);
        modules.add(testModule1);
        modules.add(testModule2);
        modules.add(testModule3);
        
        students = new ArrayList<>(3);
        Student johnDoe = new Student("JohnDoe", 21, "15-03-2000", 18385273, modules, emptyCourses);
        Student sueDoe = new Student("SueDoe", 22, "16-03-1999", 18385274, modules, emptyCourses);
        Student kateDoe = new Student("KateDoe", 23, "16-03-1998", 18385275, modules, emptyCourses);
        students.add(johnDoe);
        students.add(sueDoe);
        students.add(kateDoe);
        
        for (int i = 0; i < modules.size(); i++) {
            modules.get(i).setStudents(students);
        }
        
        start = LocalDate.parse("2021-09-06");
        end = LocalDate.parse("2021-12-17");
        
        testCourse = new Course("Computer Science", start, end, modules, students);
        
        
    }
    
    public void printAll(){
    
    
    }
    
    
}
