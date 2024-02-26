package com.heseos.crms.services;

import com.heseos.crms.domain.AuthDetails;
import com.heseos.crms.domain.User;
import com.heseos.crms.exceptions.BadRequestException;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class LoginService {
    public AuthDetails login(User user) throws BadRequestException {
        String userId = user.getUserId();
        String pwd = user.getPassword();
        if(Objects.isNull(user) || Objects.isNull(user.getUserId()) || Objects.isNull(pwd))
            throw new BadRequestException("userId or password is null or empty.");
        //validate the user creds here.
        return new AuthDetails(userId + pwd);

    }
}
