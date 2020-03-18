package com.mashe.codemaker.dto;

import lombok.Data;

/**
 * @author zfystart
 * @data 2020/3/9 - 10:50
 */
@Data
public class GithubUser {
    private String name;
    private Long id;
    private String bio;
    private String avatarUrl;

}
