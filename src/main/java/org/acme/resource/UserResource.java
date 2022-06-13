package org.acme.resource;

import org.acme.resource.dto.CreateUserDTO;
import org.acme.resource.dto.UserDTO;
import org.acme.resource.exception.CustomException;
import org.acme.resource.exception.ExceptionType;
import org.acme.service.UserService;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import java.util.List;
import java.util.stream.Collectors;

@Path("/users")
public class UserResource {

    private UserService userService;

    public UserResource(UserService userService) {
        this.userService = userService;
    }

    @POST
    public UserDTO createUser(CreateUserDTO createUserDTO) {
        return new UserDTO(userService.createUser(createUserDTO));
    }

    @GET
    @Path("/{id}")
    public UserDTO getUser(@PathParam("id") String id) {
        if (id.contains("@")) {
            throw new CustomException(ExceptionType.ID_NOT_VALID);
        } else {
            try {
                return new UserDTO(userService.getUser(id));
            } catch (Exception e) {
                throw new CustomException(ExceptionType.USER_NOT_FOUND);
            }
        }
    }

    @GET
    public List<UserDTO> getUsers() {
        return userService.getUsers().stream().map(UserDTO::new).collect(Collectors.toList());
    }

    @GET
    @Path("/handleRuntimeException")
    public Response handleRunTimeException() {
        throw new RuntimeException();
    }

}
