package com.yanglijing.service;

import com.yanglijing.entity.Tps;
import com.yanglijing.vo.TpsVo;
import org.springframework.data.domain.Page;

/**
 * @InterfaceName TpsService
 * @Description: TODO
 * @Author :lianweibo
 * @Date 2019/11/20
 * @Version V1.0
 **/
public interface TpsService {
    Page<Tps> selectList(TpsVo tpsVo);

    void deleteById(String id);
}
