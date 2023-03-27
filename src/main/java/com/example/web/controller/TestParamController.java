package com.example.web.controller;

import ch.qos.logback.core.model.Model;
import com.example.web.check.CheckParams;
import com.example.web.check.CheckType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestParamController {

    @GetMapping("/check")
    @ResponseBody
    public String check(@CheckParams(attributeName = "age",type = CheckType.AGE,value = "20")Integer age,
                        @CheckParams(attributeName = "username",type = CheckType.USERNAME)String username,
                        @CheckParams(attributeName = "password",type = CheckType.PASSWORD)String password){
        return "success";
    }


}
