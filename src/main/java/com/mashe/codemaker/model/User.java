package com.mashe.codemaker.model;

import lombok.Data;

/**
 * @author zfystart
 * @data 2020/3/11 - 17:17
 */
@Data
public class User {
    private Integer id;
    private String name;
    private String accountId;
    private String token;
    private Long gmtCreate;
    private Long gmtModified;
    private String avatarUrl;


}
