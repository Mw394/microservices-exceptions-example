package org.acme.resource.exception.customExceptions;

import java.io.Serializable;

/*
CustomException class enables you to decide the ExceptionType being thrown.
 */
public class CustomException extends RuntimeException implements Serializable {

    private final ExceptionType type;

    public CustomException(ExceptionType type) {
        this.type = type;
    }

    public ExceptionType getType() {
        return type;
    }
}
