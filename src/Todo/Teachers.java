package Todo;

import java.util.List;

public class Teachers extends Person{
   private List<Course> course;
  protected Teachers(String name,int age,String Subject) {
       super(name, age, Subject);
       this.course = course;
  }
  public void teach(Course course){
      course.add(course);
      course.setTeachers();
  }
  public void teachingacourse(Course course){
      System.out.println(name + "is teaching a course" + course.getTitle()+" "+course.getCode());
  }
}
