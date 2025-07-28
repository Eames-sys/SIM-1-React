package Todo;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class SchoolClass {
    private String name;
    private String teachers;
    private List<Student> students = new ArrayList<>();


    public SchoolClass(String name, Teachers teachers, List<Student> students) {
        this.name = name;
        this.teachers = String.valueOf(teachers);
        this.students = students;
    }

    public SchoolClass() {

    }

    public String getName() {
        return name;
    }
    public String getTeachers() {
        return teachers;
    }
    public List<Student> getStudents() {
        return students;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setTeachers(Teachers teachers) {
        this.teachers = String.valueOf(teachers);
    }
    public void setStudents(List<Student> students) {
        this.students = students;
    }
    @Override
    public String toString() {
        return name + " " + teachers + " " + students;
    }

    public static void main(String[] args) {
        SchoolClass SC = new SchoolClass();
        SC.name = UUID.randomUUID().toString();
        SC.teachers = "Mr wale";
        SC.students = new ArrayList<>();
        System.out.println(SC.toString());
    }
}
