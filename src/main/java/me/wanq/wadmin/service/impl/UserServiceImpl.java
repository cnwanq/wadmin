package me.wanq.wadmin.service.impl;

import me.wanq.wadmin.entity.system.User;
import me.wanq.wadmin.repository.system.UserRepository;
import me.wanq.wadmin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User loginByEmail(String email, String password) {
        return userRepository.findByEmailAndPassword(email, password);
    }
}
