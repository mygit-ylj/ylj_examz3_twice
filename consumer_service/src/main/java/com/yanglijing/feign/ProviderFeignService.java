package com.yanglijing.feign;

import com.yanglijing.vo.TpsVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    @GetMapping("/tps/list")
    public Object list(TpsVo tpsVo);

    @GetMapping("/tps/deleteById")
    public void deleteById(@RequestParam String id);
}
