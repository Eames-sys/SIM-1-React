package Todo;


    public class Person {
        protected String name;
        protected int age;
        protected String id;
        protected String Title;
        protected boolean hasViolatedRules;

        public Person(){

        }


        public Person(String name, int age, String id) {
            this.name = name;
            this.age = age;
            this.id = id;
            this.Title = Title;
        }

        public Person(String name, int age) {
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getId() {
            return id;
        }
        public String getTitle() {
            return Title;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", id='" + id + '\'' +
                    '}';
        }

//        public static void main(String[] args) {
//            Person p = new Person();
//            p.name = "John";
//            p.age = 13;
//            p.id = "123";
//            System.out.println(p);
//        }
//
//        public static boolean admitApplicant(Applicant applicant) {
//        }
    }




