package com.service;

import com.dao.UserRepositoty;
import com.domian.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2019\9\4 0004.
 */
@Service
public class UserService {
    @Autowired
    private UserRepositoty userRepositoty;

    public User findUserByName(String name){
        User user=null;
        user=userRepositoty.findByUserName(name);
        return user;
    }
}
