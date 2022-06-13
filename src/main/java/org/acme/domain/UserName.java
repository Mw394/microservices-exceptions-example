package org.acme.domain;

import org.acme.resource.exception.customExceptions.CustomException;
import org.acme.resource.exception.customExceptions.ExceptionType;

public class UserName {

    private String userName;

    public UserName(String userName) {
        if (!userName.toLowerCase().startsWith("dk")) {
            throw new CustomException(ExceptionType.USERNAME_NOT_VALID);
        } else {
            this.userName = userName;
        }
    }

    public String getUserName() {
        return userName;
    }
}
