package org.acme.resource.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/*
This class will handle any RuntimeExceptions throw and return a 400 bad request response.
 */
@Provider
public class RunTimeExceptionMapper implements ExceptionMapper<RuntimeException> {

    @Override
    public Response toResponse(RuntimeException exception) {
        return Response.status(400).entity(new ErrorResponse("Handling a RuntimeException via the RuntimeExceptionMapper")).build();
    }
}
