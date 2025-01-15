package exceptions;

public class InvalidMovementException extends Exception {
    public InvalidMovementException(String message) {
        super(message);
    }
    @Override
    public String getMessage() {
        return "Movement error: " + super.getMessage();
    }
}
