package by.overone.rest.exception_handling;

public class NoSuchEmployeeException extends RuntimeException{

    public NoSuchEmployeeException() {
    }

    public NoSuchEmployeeException(String message) {
        super(message);
    }

    public NoSuchEmployeeException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoSuchEmployeeException(Throwable cause) {
        super(cause);
    }

    public NoSuchEmployeeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
