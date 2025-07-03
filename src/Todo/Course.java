package Todo;

import java.util.ArrayList;
import java.util.List;

public class Course {
        private String courseName;
        private String eng;
        private String math;
        private Applicant applicant;
        private Teachers teachers;
        private  String code;
        private String Title;

    public Course(String Title, String code) {
    }

    public Course() {
        
    }

    public Course(String eng, int i) {
    }

    public void setTeachers() {
        this.teachers = (Teachers) teachers;
    }

    public void add(Course course) {
    }

    public String getTitle() {
        return Title;
    }
    public void setTitle(String title) {
        this.Title = title;
    }

    public String getCode() {

        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
}


