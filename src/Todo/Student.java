package Todo;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    List<Course> courses = new ArrayList<>();

    boolean isEnrolled = false;

    public Student(String name, int age,String id) {
        super(name, age, id);
    }
    public Student() {
    }

    public Student(int age, String name) {
    }

    public void takeCourse(Course course) {
        courses.add(course);
    }
    public List<Course> getCourses() {
        return courses;
    }
    public void expel(){
        isEnrolled = false;
    }
    public boolean isEnrolled() {
        return isEnrolled;
    }
}
