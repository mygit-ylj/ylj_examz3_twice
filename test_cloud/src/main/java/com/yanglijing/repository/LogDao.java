package com.yanglijing.repository;

import com.yanglijing.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName LogDao
 * @Description: TODO
 * @Author :yanglijing
 * @Date 2019/11/21
 * @Version V1.0
 **/
@Repository
public class LogDao {

    @Autowired
    private MongoTemplate mongoTemplate;

    public void saveLog(Log log){
        mongoTemplate.insert(log);
    }

    public void deleteById(String id){
        Log log = mongoTemplate.findById(id, Log.class);
        mongoTemplate.remove(log);
    }

    public List<Log> findAll(){
        List<Log> list = mongoTemplate.findAll(Log.class);
        return list;
    }
}
