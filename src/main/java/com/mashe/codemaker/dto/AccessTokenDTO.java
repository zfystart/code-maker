package com.mashe.codemaker.dto;

import lombok.Data;

/**
 * @author zfystart
 * @data 2020/3/8 - 21:45
 */
@Data
public class AccessTokenDTO {
    private String client_id;
    private String client_secret;
    private String code;
    private String redirect_uri;
    private String state;


}
