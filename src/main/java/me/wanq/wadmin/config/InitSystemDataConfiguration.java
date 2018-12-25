package me.wanq.wadmin.config;

import me.wanq.wadmin.entity.system.User;
import me.wanq.wadmin.repository.system.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class InitSystemDataConfiguration implements CommandLineRunner {

    @Autowired
    UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        // 初始化数据
        initUser();

    }

    void initUser() {
        if (userRepository.count() == 0) {
            User user = new User();
            user.setName("admin");
            user.setEmail("admin@admin.com");
            user.setPhone("110");
            user.setPassword("123456");
            userRepository.save(user);
        }
    }


}
