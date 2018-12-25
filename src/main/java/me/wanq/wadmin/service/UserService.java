package me.wanq.wadmin.service;

import me.wanq.wadmin.entity.system.User;

public interface UserService {

    public User loginByEmail(String email, String password);
}
