package com.yanglijing.feign;

import com.yanglijing.entity.Tps;
import com.yanglijing.vo.TpsVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @InterfaceName ProviderFeignService
 * @Description: TODO
 * @Author :lianweibo
 * @Date 2019/11/19
 * @Version V1.0
 **/
@FeignClient(name = "provider-service")
public interface ProviderFeignService {

    @RequestMapping("/provider/users")
    public List<String> selectAllUsers();

    //@RequestMapping(value = "/tps/list",method = RequestMethod.POST)
    @PostMapping("/tps/list")
    public Object list(@RequestBody TpsVo tpsVo);

    @RequestMapping("/tps/deleteByIds")
    public void deleteByIds(@RequestParam("ids")List<Tps> ids);
}
