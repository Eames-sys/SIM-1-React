package User;

import java.util.*;

public class LibraryWithPriority {
    private static Map<String, Book> books = new HashMap<>();
    private static PriorityQueue<BookRequest> queue = new PriorityQueue<>(new Comparator<BookRequest>() {
        @Override
        public int compare(BookRequest o1, BookRequest o2) {
            Candidate c1 = o1.getUser();
            Candidate c2 = o2.getUser();
            //comparison between teacher and students
            if(c1 instanceof Teacher && !(c2 instanceof Teacher)) return -1;
            if(!(c1 instanceof Student) && c2 instanceof Teacher) return 1;

            if(c1 instanceof Student && c2 instanceof Student){
                return Integer.compare(((Student)c2).getLevel(),((Student)c1).getLevel());

            }
            return Long.compare(o1.getTimestamp(), o2.getTimestamp());
        }


    });


    public void addBook(String title, int copies) {


        books.put(title, new Book(title,copies));
    }
    public static void requestBook(Candidate candidate, String title) {
        queue.offer(new BookRequest(candidate,title));

    }
    public static String serveNextRequest() {
        if (queue.isEmpty()) return "no request";
        BookRequest Request = queue.poll();
        Book book = books.get(Request.getTitle());

        if (book == null || book.getAvailiableCopies()==0) return "there is no book";
        return " ";
    }
}
