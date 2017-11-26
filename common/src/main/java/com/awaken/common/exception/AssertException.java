package com.awaken.common.exception;

public class AssertException extends RuntimeException {

    public AssertException() {
        super();
    }

    public AssertException(Throwable cause) {
        super(cause);
    }

    public AssertException(String message) {
        super(message);
    }

    public AssertException(String message, Throwable cause) {
        super(message, cause);
    }

}
