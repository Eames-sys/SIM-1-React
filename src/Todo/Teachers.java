package Todo;

public class Teachers extends Person{
  protected Teachers(String name,int age) {
      // super(name, age, id);
  }
  public void teach(Course course){
      course.setTeachers(this);
  }
}
