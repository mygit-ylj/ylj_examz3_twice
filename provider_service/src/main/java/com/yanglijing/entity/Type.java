package com.yanglijing.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @ClassName Type
 * @Description: TODO
 * @Author :yanglijing
 * @Date 2019/11/20
 * @Version V1.0
 **/
@Entity
@Table
@Data
public class Type {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer tid;
    private String tname;
}
