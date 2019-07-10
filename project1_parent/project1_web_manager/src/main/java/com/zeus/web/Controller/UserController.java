package com.zeus.web.Controller;

import com.zeus.domain.User;
import com.zeus.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping(value = "/list")
    public @ResponseBody List<User> list(){
        System.out.println("as");
        return userService.findAll();
    }
}
