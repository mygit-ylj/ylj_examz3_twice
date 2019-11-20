package com.yanglijing.vo;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @ClassName Tps
 * @Description: TODO
 * @Author :yanglijing
 * @Date 2019/11/20
 * @Version V1.0
 **/
@Data
public class TpsVo {

    private Integer tid;
    private String propName;
    private String content;
   /* private String id;
    private Integer jobId;
    private String name;
    private String expert;
    private String phone;
    private String remarks;*/
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date startDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date endDate;

    private Integer pageNum;
    private Integer pageSize;
}
