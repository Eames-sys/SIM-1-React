package User;

public class Main {
    public static void main(String[] args) {

//        LibraryWithoutPriority Library = new LibraryWithoutPriority();
//        Library.addBook("Maths",10);

//        Candidate student = new Student("Osinachi",100);
//        Candidate student2 = new Teacher("Mr Festus");

//        Library.requestBook(student, "Maths");
//
//        Candidate teacher = null;
//        Library.requestBook(teacher, "Maths");
//
//        System.out.println(Library.serveNextRequest());
//
//        LibraryWithPriority LibraryWithPriority = new LibraryWithPriority();
//        LibraryWithPriority.addBook("Maths",0);
        LibraryWithPriority libraryWithPriority = new LibraryWithPriority();
        libraryWithPriority.addBook("Maths",2);

        Candidate student = new Student("Eniola",100);
        Candidate teacher = new Teacher("Mr Festus");
        Candidate student3 = new Student("Josh",300);

        LibraryWithPriority.requestBook(student, "Java");
        LibraryWithPriority.requestBook(teacher, "Python");
        LibraryWithPriority.requestBook(student3, "C++");

        System.out.println(LibraryWithPriority.serveNextRequest());
        System.out.println(LibraryWithPriority.serveNextRequest());
        System.out.println(LibraryWithPriority.serveNextRequest());
    }
}
