package com.yanglijing.repository;

import com.yanglijing.entity.Tps;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @InterfaceName TpsReposiitory
 * @Description: TODO
 * @Author :lianweibo
 * @Date 2019/11/20
 * @Version V1.0
 **/
public interface TpsReposiitory extends JpaRepository<Tps,String>, JpaSpecificationExecutor<Tps> {
}
