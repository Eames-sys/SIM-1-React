package Todo;

import java.util.ArrayList;
import java.util.List;

public class SchoolClass {
    private String name;
    private Teachers teachers;
    private List<Student> students = new ArrayList<>();

    public SchoolClass(String name, Teachers teachers, List<Student> students) {
        this.name = name;
        this.teachers = teachers;
        this.students = students;
    }
    public String getName() {
        return name;
    }
    public Teachers getTeachers() {
        return teachers;
    }
    public List<Student> getStudents() {
        return students;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setTeachers(Teachers teachers) {
        this.teachers = teachers;
    }
    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
