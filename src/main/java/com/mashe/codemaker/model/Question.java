package com.mashe.codemaker.model;


import lombok.Data;

/**
 * @author zfystart
 * @data 2020/3/13 - 21:30
 */
@Data
public class Question {
    private Integer id;
    private String title;
    private String description;
    private Long gmtCreate;
    private Long gmtModified;
    private Integer creator;
    private Integer comentCount;
    private Integer viewCount;
    private Integer likeCount;
    private String tag;



}
