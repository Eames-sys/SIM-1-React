package User;

import javax.print.attribute.standard.Copies;

public class BookRequest {
    private Candidate user;
    private String title;
    private long timestamp;
    private Copies copies;

    public BookRequest(Candidate user, String title, long timestamp, Copies copies) {
        this.user = user;
        this.title = title;
        this.timestamp = timestamp;
        this.copies = copies;

    }

    public BookRequest(Candidate candidate, String title) {
    }


    public Candidate getUser() {
        return user;
    }
    public void setUser(Candidate user) {
        this.user = user;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public long getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
    public Copies getCopies() {
        return copies;
    }

    @Override
    public String toString() {
        return user.toString() + ", " + title + ", " + timestamp + ", " + copies.toString();
    }
}
