package org.acme.domain;

import org.acme.resource.exception.CustomException;
import org.acme.resource.exception.ExceptionType;

public class Password {

    private String password;

    public Password(String password) {
        if (password.length() < 5) {
            throw new CustomException(ExceptionType.PASSWORD_NOT_VALID);
        } else {
            this.password = password;
        }

    }

    public String getPassword() {
        return password;
    }
}
