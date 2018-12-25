package me.wanq.wadmin.web;

import me.wanq.wadmin.entity.web.PageContent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MainController {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    HttpServletRequest request;
    @Autowired
    PageContent pageContent;

    @RequestMapping(value = {"/", "/main.html"})
    public String index() {
        return "main.html";
    }

    @GetMapping("modules/**")
    public String modulesPath() {
        String requestUrl = request.getServletPath();

        // 检查当前用户是否存在权限


        // 有权限，准备数据
        request.setAttribute("title", requestUrl);

        String tempalgePage = requestUrl.substring(1);
        logger.info(tempalgePage);

        return tempalgePage;
    }
}
