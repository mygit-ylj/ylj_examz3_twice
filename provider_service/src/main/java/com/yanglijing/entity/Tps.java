package com.yanglijing.entity;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @ClassName Tps
 * @Description: TODO
 * @Author :yanglijing
 * @Date 2019/11/20
 * @Version V1.0
 **/
@Entity
@Table
@Data
public class Tps {

    @Id
    @GeneratedValue
    private String id;
    private BigDecimal price;
    private Integer jobId;
    private String name;
    private String expert;
    private String phone;
    private String photoUrl;
    private String remarks;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date created;
    @ManyToOne
    @JoinColumn(name = "tid")
    private Type type;
}
