// Darren Browne - 18385273
package partB18385273;

// imports
import java.util.ArrayList;
import partA18385273.Course;
import partA18385273.Student;
import partA18385273.Module;
import org.joda.time.LocalDate;

public class driverProject {

    public driverProject(){}

    public void testAll(){

        // this method tests the project
        // creates 5 students, 5 courses & 5 modules
        // Add mix of students to modules and then modules to courses
        // Prints out the Course list, Students list & Modules list
        
        // class variables
        ArrayList<Student> students;
        ArrayList<Module> modules;
        ArrayList<Course> courses;
        LocalDate start, end;
        
        // creates a list of modules
        modules = new ArrayList<>(5);
        Module testModule1 = new Module("CT144", 4506);
        Module testModule2 = new Module("CT145", 4507);
        Module testModule3 = new Module("CT146", 4508);
        Module testModule4 = new Module("CT147", 4509);
        Module testModule5 = new Module("CT148", 4510);
        modules.add(testModule1);
        modules.add(testModule2);
        modules.add(testModule3);
        modules.add(testModule4);
        modules.add(testModule5);
        
        // creates a list of students
        students = new ArrayList<>(5);
        Student johnDoe = new Student("JohnDoe", 21, "15-03-2000", 18385273);
        Student sueDoe = new Student("SueDoe", 22, "16-03-1999", 18385274);
        Student kateDoe = new Student("KateDoe", 23, "17-03-1998", 18385275);
        Student darrenDoe = new Student("DarrenDoe", 24, "16-04-1997", 18385275);
        Student claireDoe = new Student("ClaireDoe", 25, "16-05-1996", 18385275);
        students.add(johnDoe);
        students.add(sueDoe);
        students.add(kateDoe);
        students.add(darrenDoe);
        students.add(claireDoe);
        
        //creates a list of courses
        courses = new ArrayList<>(5);
        start = LocalDate.parse("2021-09-06");
        end = LocalDate.parse("2021-12-17");
        Course testCourse1 = new Course("Computer Science", start, end);
        Course testCourse2 = new Course("Engineering", start, end);
        Course testCourse3 = new Course("Physics", start, end);
        Course testCourse4 = new Course("Arts ", start, end);
        Course testCourse5 = new Course("Law", start, end);
        courses.add(testCourse1);
        courses.add(testCourse2);
        courses.add(testCourse3);
        courses.add(testCourse4);
        courses.add(testCourse5);
        
        // add students to modules
        // CT144 has John and Sue
        modules.get(0).addStudent(students.get(0));
        modules.get(0).addStudent(students.get(1));
        
        // CT145 has John and Kate
        modules.get(1).addStudent(students.get(0));
        modules.get(1).addStudent(students.get(2));
        
        // CT146 has John, Darren and Claire
        modules.get(2).addStudent(students.get(0));
        modules.get(2).addStudent(students.get(3));
        modules.get(2).addStudent(students.get(4));
        
        // CT147 has Claire, Sue and Kate
        modules.get(3).addStudent(students.get(4));
        modules.get(3).addStudent(students.get(1));
        modules.get(3).addStudent(students.get(2));
        
        // CT148 has Darren and Kate
        modules.get(4).addStudent(students.get(3));
        modules.get(4).addStudent(students.get(2));
        
        // Add Courses to students
        students.get(0).addCourse(courses.get(0).getName());
        students.get(1).addCourse(courses.get(1).getName());
        students.get(2).addCourse(courses.get(2).getName());
        students.get(3).addCourse(courses.get(3).getName());
        students.get(4).addCourse(courses.get(4).getName());
        
        // Add Students to their respective courses
        courses.get(0).addStudent(students.get(0).getName());
        courses.get(1).addStudent(students.get(1).getName());
        courses.get(2).addStudent(students.get(2).getName());
        courses.get(3).addStudent(students.get(3).getName());
        courses.get(4).addStudent(students.get(4).getName());
        
        
        // Add the students modules to their courses
        // Computer Science has CT144, CT145 and CT146
        courses.get(0).addModule(modules.get(0));
        courses.get(0).addModule(modules.get(1));
        courses.get(0).addModule(modules.get(2));
        
        // Engineering has CT144 and CT147
        courses.get(1).addModule(modules.get(0));
        courses.get(1).addModule(modules.get(3));
        
        // Physics has CT146, CT147 and CT148
        courses.get(2).addModule(modules.get(2));
        courses.get(2).addModule(modules.get(3));
        courses.get(2).addModule(modules.get(4));
        
        // Arts has CT147 and CT148
        courses.get(3).addModule(modules.get(3));
        courses.get(3).addModule(modules.get(4));
        
        // Law has  CT146 and CT147
        courses.get(4).addModule(modules.get(2));
        courses.get(4).addModule(modules.get(3));
        
        // add Couse Names to their associated Modules
        
        // CT144 has Comp Sci and Engineering Students
        modules.get(0).addCourse(courses.get(0).getName());
        modules.get(0).addCourse(courses.get(1).getName());
        
        // CT145
        modules.get(1).addCourse(courses.get(0).getName());
        modules.get(1).addCourse(courses.get(2).getName());
        
        // CT146
        modules.get(2).addCourse(courses.get(0).getName());
        modules.get(2).addCourse(courses.get(3).getName());
        modules.get(2).addCourse(courses.get(4).getName());
        
        // CT147
        modules.get(3).addCourse(courses.get(4).getName());
        modules.get(3).addCourse(courses.get(1).getName());
        modules.get(3).addCourse(courses.get(2).getName());
        
        // CT148
        modules.get(4).addCourse(courses.get(3).getName());
        modules.get(4).addCourse(courses.get(2).getName());
        
        //print students info
        System.out.println("Printing all Students:");
        for (Student su : students) {
            System.out.println(su.toString());
        }
        
        //print modules info
        System.out.println("Printing all Modules:");
        for (Module m : modules) {
            System.out.println(m.toString());
        }
        
        //print courses info
        System.out.println("Printing all Courses:");
        for (Course c : courses) {
            System.out.println(c.toString());
        }
    }
}
