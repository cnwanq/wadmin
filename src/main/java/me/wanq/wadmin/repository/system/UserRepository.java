package me.wanq.wadmin.repository.system;

import me.wanq.wadmin.entity.system.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

    User findByNameAndPassword(String name, String password);
    User findByEmailAndPassword(String email, String password);
    User findByPhoneAndPassword(String phone, String password);

}
