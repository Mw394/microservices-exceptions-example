package org.acme.resource.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateUserDTO {

    private String userName;
    private String password;

    public CreateUserDTO(@JsonProperty("userName") String userName, @JsonProperty("password") String password) {
        this.password = password;
        this.userName = userName;
    }


    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
