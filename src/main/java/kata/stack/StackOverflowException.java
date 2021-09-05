package kata.stack;

public class StackOverflowException extends RuntimeException {  // Unchecked Exception
    public StackOverflowException(String message) {
        super(message);
    }
}
