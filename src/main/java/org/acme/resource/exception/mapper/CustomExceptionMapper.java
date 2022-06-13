package org.acme.resource.exception.mapper;

import org.acme.resource.exception.ErrorResponse;
import org.acme.resource.exception.customExceptions.CustomException;
import org.acme.resource.exception.customExceptions.ExceptionType;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/*
CustomExceptionMapper checks the ExceptionType of the CustomException and sends an appropriate response to user.
 */
@Provider
public class CustomExceptionMapper implements ExceptionMapper<CustomException> {

    @Override
    public Response toResponse(CustomException exception) {
        if (exception.getType() == ExceptionType.USER_NOT_FOUND) {
            return Response.status(404).entity(new ErrorResponse("User not found")).build();
        } else if (exception.getType() == ExceptionType.ID_NOT_VALID){
            return Response.status(400).entity(new ErrorResponse("ID not valid")).build();
        } else if (exception.getType() == ExceptionType.PASSWORD_NOT_VALID) {
            return Response.status(400).entity(new ErrorResponse("Password not valid")).build();
        } else {
            return Response.status(400).entity(new ErrorResponse("Username not valid")).build();
        }
    }
}
