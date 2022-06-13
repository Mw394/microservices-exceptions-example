package org.acme.resource.dto;

import org.acme.domain.User;

public class UserDTO {

    private String userName;
    private String password;
    private String id;

    public UserDTO(User user) {
        this.password = user.getPassword().getPassword();
        this.userName = user.getUserName().getUserName();
        this.id = user.getId();
    }


    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getId() {
        return id;
    }
}
