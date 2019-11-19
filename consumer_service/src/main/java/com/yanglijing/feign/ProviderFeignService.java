package com.yanglijing.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
