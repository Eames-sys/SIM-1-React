package User;

public class Book {
    int BookID;
    String BookName;
    String Author;
     static int Copies;
     int availableCopies;
    
    public Book(int BookID, String BookName, String Author, int Copies) {
        this.BookID = BookID;
        this.BookName = BookName;
        this.Author = Author;
        this.Copies = Copies;
        this.availableCopies = availableCopies;
    }

    public Book(String title, String copies) {
    }

    public Book(String title, int copies) {
    }


    public int getBookID() {
        return BookID;
    }
    public void setBookID(int BookID) {
        this.BookID = BookID;
    }
    public String getBookName() {
        return BookName;
    }
    public void setBookName(String BookName) {
        this.BookName = BookName;
    }
    public String getAuthor() {
        return Author;
    }
    public void setAuthor(String Author) {
        this.Author = Author;
    }
    public static int getCopies() {
        return Copies;
    }
    public void setCopies(int Copies) {
        this.Copies = Copies;
    }
    public boolean AvailiableCopies() {
        return Copies > 0;
    }
    public void borrowed(){
       if (AvailiableCopies()) {
           throw new RuntimeException("Book is already borrowed");
          
       }
       Copies++;
    }
    public void returned(){
        if (AvailiableCopies()) {
            throw new RuntimeException("Book is already returned");
        }
        Copies--;
    }
    @Override
    public String toString() {
        return BookID+" "+BookName + " " + Author + " " + Copies;
    }

    public int getAvailiableCopies() {
        return availableCopies;
    }
}
