package com.lrm.service;

import com.lrm.po.User;

/**
 * Created by limi on 2021/10/15.
 */
public interface UserService {

    User checkUser(String username, String password);
}
