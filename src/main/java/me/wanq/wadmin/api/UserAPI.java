package me.wanq.wadmin.api;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.util.JSONPObject;
import me.wanq.wadmin.common.rest.Result;
import me.wanq.wadmin.common.rest.ResultGenerator;
import me.wanq.wadmin.entity.system.User;
import me.wanq.wadmin.repository.system.UserRepository;
import org.hibernate.mapping.Collection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import me.wanq.wadmin.entity.datatable.DataTableModel;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1")
public class UserAPI {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    UserRepository userRepository;

    @GetMapping("/users")
    public Result getAllUser() {
        List<User> users = userRepository.findAll();
        return ResultGenerator.genSuccessResult(users);
    }

    @GetMapping("/user/{userId}")
    public Result getUser(@PathVariable Integer userId) throws Exception {
        User user = userRepository.getOne(userId);
        return ResultGenerator.genSuccessResult(user);
    }

    @PostMapping("/user")
    public Result addUser(@RequestBody DataTableModel model) {
//        return ResultGenerator.genSuccessResult(userService.addUser(data));
        List<User> users = new ArrayList<User>();
        for (Map<String, Object> map: model.data.values()) {
            User user = JSONObject.parseObject(JSON.toJSONString(map), User.class);
            logger.info(JSON.toJSONString(user));
            users.add(user);
        }

        Iterable<User> iterable = users;
        if (model.isAdd()) {
            logger.info("add");
            users = userRepository.saveAll(iterable);
        } else if (model.isUpdate()) {
            logger.info("update");
            users = userRepository.saveAll(iterable);
        } else if (model.isDelete()) {
            logger.info("delete");
            userRepository.deleteAll(iterable);
            users.clear();
        }
        return ResultGenerator.genSuccessResult(users);
    }
}
