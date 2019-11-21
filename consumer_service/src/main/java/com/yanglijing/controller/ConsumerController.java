package com.yanglijing.controller;

import com.yanglijing.feign.ProviderFeignService;
import com.yanglijing.vo.TpsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
@CrossOrigin
public class ConsumerController {

    @Autowired
    private ProviderFeignService providerFeignService;

    @RequestMapping("/user/list")
    public List<String> showUsers(){
        return providerFeignService.selectAllUsers();
    }

    @RequestMapping("/list")
    public Object list(@RequestBody TpsVo tpsVo){
        return providerFeignService.list(tpsVo);
    }

    @GetMapping("/deleteById")
    public void deleteById(@RequestParam("id") String id){
        providerFeignService.deleteById(id);
    }

}
