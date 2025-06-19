package Extend;

public class UserError extends RuntimeException {

    public UserError(String message) {
        super(message);
    }
}
