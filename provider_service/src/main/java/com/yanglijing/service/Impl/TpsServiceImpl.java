package com.yanglijing.service.Impl;

import com.yanglijing.entity.Tps;
import com.yanglijing.repository.TpsReposiitory;
import com.yanglijing.service.TpsService;
import com.yanglijing.vo.TpsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName TpsServiceImpl
 * @Description: TODO
 * @Author :yanglijing
 * @Date 2019/11/20
 * @Version V1.0
 **/
@Service
public class TpsServiceImpl implements TpsService {

    @Autowired
    TpsReposiitory tpsReposiitory;

    @Override
    public Page<Tps> selectList(TpsVo tpsVo) {
        Specification<Tps> spec = new Specification<Tps>() {
            @Override
            public Predicate toPredicate(Root<Tps> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder cb) {

                List<Predicate> list = new ArrayList<>();

                if (tpsVo.getPropName()!=null){
                    Predicate p1 = cb.like(root.get(tpsVo.getPropName()), "%"+tpsVo.getContent()+"%");
                    list.add(p1);
                }

                if (tpsVo.getStartDate()!=null){
                    Predicate p2 = cb.greaterThanOrEqualTo(root.get("created"), tpsVo.getStartDate());
                    list.add(p2);
                }
                if (tpsVo.getEndDate()!=null){
                    Predicate p3 = cb.lessThanOrEqualTo(root.get("created"), tpsVo.getEndDate());
                    list.add(p3);
                }
                if (tpsVo.getTid()!=null){
                    Predicate p4 = cb.equal(root.get("majorType").get("tid"), tpsVo.getTid());
                    list.add(p4);
                }

                Predicate[] newArr = list.toArray(new Predicate[list.size()]);
                return cb.and(newArr);
            }
        };
        Page<Tps> page = tpsReposiitory.findAll(spec, PageRequest.of(tpsVo.getPageNum() - 1, tpsVo.getPageSize()));
        return page;
    }

    @Override
    public void deleteByIds(List<Tps> ids) {
        tpsReposiitory.deleteAll(ids);
    }
}
