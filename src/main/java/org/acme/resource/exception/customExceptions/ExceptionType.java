package org.acme.resource.exception.customExceptions;

/*
Enum of Types of Custom Exceptions you want to throw.
If you add an ExceptionType remember to handle it in the CustomExceptionMapper, to make sure an appropriate response is sent.
 */
public enum ExceptionType {

    USER_NOT_FOUND,
    ID_NOT_VALID,
    PASSWORD_NOT_VALID,
    USERNAME_NOT_VALID
}
