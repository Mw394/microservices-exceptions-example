package org.acme.repo;

import org.acme.domain.Password;
import org.acme.domain.User;
import org.acme.domain.UserName;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.print.attribute.standard.Media;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Dependent
public class UserRepo {

    private HashMap<String, User> map;

    @Inject
    public UserRepo() {
        this.map = new HashMap<>();
    }


    public User createUser(String userName, String password) {
        String id = UUID.randomUUID().toString();
        map.put(id, new User(new UserName(userName), new Password(password), id));
        return map.get(id);
    }

    public User getUser(String id) {
        return map.get(id);
    }

    public List<User> getUsers() {
        return new ArrayList<>(map.values());
    }
}
