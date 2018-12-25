package me.wanq.wadmin.api;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import me.wanq.wadmin.common.enums.ErrorInfo;
import me.wanq.wadmin.common.rest.Result;
import me.wanq.wadmin.entity.system.User;
import me.wanq.wadmin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

@RestController
@CrossOrigin
public class LoginAPI {

    @Autowired
    UserService userService;

    @PostMapping("/login")
    public String doLogin(@RequestBody JSONObject jsonParam) {
        System.out.println(jsonParam.toString());
        String email = jsonParam.get("email").toString();
        String password = jsonParam.get("password").toString();
        User user = userService.loginByEmail(email, password);

        Result result = new Result();
        if (user != null) {
            result.setResult(user).setSuccess();
        } else {
//            result.setError(1000, "邮箱或密码不正确");
            result.setError(ErrorInfo.LoginError);
        }
        return JSON.toJSONString(result);
    }

}
