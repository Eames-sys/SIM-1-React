package Todo;

        public class Principal extends Person {
            public Principal(String name, int age) {

            }
         public Principal(){

         }

            public Principal(String michael, int i, Object o) {
            }

            public Student admit(Applicant applicant) {
                if (applicant.getAge() >= 18){
                    return new Student(applicant.getAge(), applicant.getName());
                }else {
                    System.out.println("You are too young to be admitted");
                }
                return null;
         }
         public void expel(Student student) {
                if (student.getAge() >= 18 && student.hasViolatedRules()){
                    student.expel();
                    System.out.println(student.getName() + "he has been expelled by the principal");
                }else{
                    System.out.println("You are not expelled");
                }
               }


        }



