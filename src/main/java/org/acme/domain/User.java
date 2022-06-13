package org.acme.domain;

public class User {

    private UserName userName;

    private Password password;

    private String id;

    public User(UserName userName, Password password, String id) {
        this.password = password;
        this.userName = userName;
        this.id = id;
    }


    public UserName getUserName() {
        return userName;
    }

    public Password getPassword() {
        return password;
    }

    public String getId() {
        return id;
    }
}
