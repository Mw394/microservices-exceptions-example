package org.acme.service;

import org.acme.domain.User;
import org.acme.repo.UserRepo;
import org.acme.resource.dto.CreateUserDTO;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import java.util.List;

@Dependent
public class UserService {

    private UserRepo userRepo;

    @Inject
    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public User createUser(CreateUserDTO createUserDTO) {
        return userRepo.createUser(createUserDTO.getUserName(), createUserDTO.getPassword());
    }

    public User getUser(String id) {
        return userRepo.getUser(id);
    }

    public List<User> getUsers() {
        return userRepo.getUsers();
    }

}
