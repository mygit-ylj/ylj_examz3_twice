package com.yanglijing.controller;

import com.yanglijing.feign.ProviderFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName ConsumerController
 * @Description: TODO
 * @Author :yanglijing
 * @Date 2019/11/19
 * @Version V1.0
 **/
@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    @Autowired
    private ProviderFeignService providerFeignService;

    @RequestMapping("/user/list")
    public List<String> showUsers(){
        return providerFeignService.selectAllUsers();
    }

}
