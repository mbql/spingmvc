package com.kawa.controller;

import com.kawa.pojo.User;
import com.kawa.service.Impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/Msg")
public class UserController {
    @Autowired
    public UserServiceImpl userServiceImpl;

    @RequestMapping("/T")
    public ModelAndView hello(@RequestParam(value = "id", defaultValue = "2") int id) {
        ModelAndView mv = new ModelAndView("T");
        User user = userServiceImpl.getFindId(id);
        mv.addObject("user", user);
        mv.setViewName("T");
        System.out.println(mv);
        System.out.println(user);
        System.out.println(user.getId() + " " + user.getUserCode() + " " + user.getUserName() + " " + user.getUserPassword());
        return mv;
    }
}
