package com.yanglijing.controller;

import com.yanglijing.entity.Tps;
import com.yanglijing.service.TpsService;
import com.yanglijing.vo.TpsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @PostMapping("/list")
    public Object list(@RequestBody TpsVo tpsVo){
        return tpsService.selectList(tpsVo);
    }

    @RequestMapping("/deleteByIds")
    public void deleteByIds(@RequestParam("ids")List<Tps> ids){
        tpsService.deleteByIds(ids);
    }
}
