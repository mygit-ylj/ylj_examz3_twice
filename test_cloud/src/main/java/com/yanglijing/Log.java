package com.yanglijing;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * @ClassName Log
 * @Description: TODO
 * @Author :yanglijing
 * @Date 2019/11/21
 * @Version V1.0
 **/
@Document(collection = "log")
@Data
public class Log {
    private String id;
    private Long userId;
    private Date createTime;
    private Integer logType;
    private String content;
}
