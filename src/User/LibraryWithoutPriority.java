package User;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class LibraryWithoutPriority {
    private Map<String, Book>books = new HashMap<>();
    private Queue<BookRequest> queue = new LinkedList<>();
    String copies;
    public void addBook(String title, int book) {

        books.put(title, new Book(title,copies));
    }
    public void requestBook(Candidate candidate,String title) {
        queue.offer(new BookRequest(candidate,title));

    }
    public String serveNextRequest() {
        if (queue.isEmpty()) return "no request";
        BookRequest Request = queue.poll();
        Book book = books.get(Request.getTitle());

        if (book == null || book.AvailiableCopies()) return "book taken";
        book.borrowed();
        return Request.getUser().getName()+" borrowed"+Request.getTitle();
    }





















    public Queue<BookRequest> getBooksQueue() {
        return queue;
    }

    public void setBooksQueue(Queue<BookRequest> booksQueue) {
        this.queue = booksQueue;
    }

    public Map<String, Book> getBooks() {
        return books;
    }

    public void setBooks(Map<String, Book> books) {
        this.books = books;
    }
}
