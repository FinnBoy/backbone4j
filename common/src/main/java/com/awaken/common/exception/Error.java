package com.awaken.common.exception;

public class Error {

    private int messageCode;

    private int exceptionCode;

    private String[] embeddedValues;

    private String message;

    public int getMessageCode() {
        return messageCode;
    }

    public void setMessageCode(int messageCode) {
        this.messageCode = messageCode;
    }

    public int getExceptionCode() {
        return exceptionCode;
    }

    public void setExceptionCode(int exceptionCode) {
        this.exceptionCode = exceptionCode;
    }

    public String[] getEmbeddedValues() {
        return embeddedValues;
    }

    public void setEmbeddedValues(String[] embeddedValues) {
        this.embeddedValues = embeddedValues;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
