package com.yanglijing.test;

import com.yanglijing.Log;
import com.yanglijing.repository.LogDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @ClassName LogDaoTest
 * @Description: TODO
 * @Author :yanglijing
 * @Date 2019/11/21
 * @Version V1.0
 **/
@SpringBootTest
@RunWith(SpringRunner.class)
public class LogDaoTest {


    @Autowired
    private LogDao logDao;

    @Test
    public void insertTest(){
        Log log = new Log();
        log.setUserId(10065L);
        log.setLogType(1);
        logDao.saveLog(log);
    }
}
