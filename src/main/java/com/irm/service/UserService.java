package com.irm.service;

import com.irm.po.User;

public interface UserService {
    User checkUser(String username, String password);
}
