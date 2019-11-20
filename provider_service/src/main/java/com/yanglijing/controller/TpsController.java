package com.yanglijing.controller;

import com.yanglijing.service.TpsService;
import com.yanglijing.vo.TpsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName TpsController
 * @Description: TODO
 * @Author :yanglijing
 * @Date 2019/11/20
 * @Version V1.0
 **/
@RestController
@RequestMapping("/tps")
@CrossOrigin
public class TpsController {

    @Autowired
    TpsService tpsService;

    @GetMapping("/list")
    public Object list(@RequestParam("tpsVo") TpsVo tpsVo){
        return tpsService.selectList(tpsVo);
    }

    @GetMapping("/deleteById")
    public void deleteById(@RequestParam("id") String id){
        tpsService.deleteById(id);
    }
}
