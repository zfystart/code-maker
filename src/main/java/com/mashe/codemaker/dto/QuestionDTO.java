package com.mashe.codemaker.dto;

import com.mashe.codemaker.model.User;
import lombok.Data;

/**
 * @author zfystart
 * @data 2020/3/15 - 17:46
 */
@Data
public class QuestionDTO {
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
    private User user;
}
