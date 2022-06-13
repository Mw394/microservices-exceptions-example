package org.acme.resource.exception;


/*
Custom ErrorReponse. Can be expanded with more info should it be wanted.
 */
public class ErrorResponse {

    private final String message;

    public ErrorResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
