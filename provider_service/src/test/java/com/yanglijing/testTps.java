package com.yanglijing;

import com.yanglijing.entity.Tps;
import com.yanglijing.repository.TpsReposiitory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;

/**
 * @ClassName testTps
 * @Description: TODO
 * @Author :yanglijing
 * @Date 2019/11/20
 * @Version V1.0
 **/
@SpringBootTest
@RunWith(SpringRunner.class)
public class testTps {

    @Autowired
    TpsReposiitory tpsReposiitory;

    @Test
    public void testTpsSave(){
        Tps tps = new Tps();
        tps.setId("SQ03100");
        tps.setPrice(new BigDecimal(20000));
        tps.setJobId(200001);
        tps.setName("ylj");
        tps.setPhone("123456789");
        tps.setPhotoUrl("1bdea94a-7e90-46ed-8626-5fc9c42ef623.jpg");
        tps.setRemarks("提前协商咨询主题和时间安排");
        Calendar c = Calendar.getInstance();
        c.set(2019,10,12,10,11,11);
        Date time = c.getTime();
        tps.setCreated(time);
        tpsReposiitory.save(tps);

    }
}
