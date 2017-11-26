package com.awaken.common.exception;

public class ApplicationException extends RuntimeException {

    private Error error;

    public Error getError() {
        return error;
    }

    public ApplicationException() {
        super();
    }

    public ApplicationException(Throwable cause) {
        super(cause);
    }

    public ApplicationException(String message) {
        super(message);
    }

    public ApplicationException(String message, Throwable cause) {
        super(message, cause);
    }

    public ApplicationException(Error error) {
        super(error.getMessage());
        this.error = error;
    }

    public ApplicationException(Error error, Throwable cause) {
        super(error.getMessage(), cause);
        this.error = error;
    }

}
