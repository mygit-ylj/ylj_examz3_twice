package com.yanglijing.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * @ClassName ProviderController
 * @Description: TODO
 * @Author :yanglijing
 * @Date 2019/11/19
 * @Version V1.0
 **/
@RestController
@RequestMapping("/provider")
public class ProviderController {

    @RequestMapping("/users")
    public List<String> showUsers(){
        return Arrays.asList("连伟博","杨莉菁");
    }

}
