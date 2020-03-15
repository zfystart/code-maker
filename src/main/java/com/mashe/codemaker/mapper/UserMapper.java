package com.mashe.codemaker.mapper;

import com.mashe.codemaker.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author zfystart
 * @data 2020/3/11 - 14:08
 */

@Mapper
public interface UserMapper {

    @Insert("insert into user(name,account_id,token,gmt_create,gmt_modified,avatar_url) values(#{name},#{accountId},#{token},#{gmtCreate},#{gmtModified},#{avatarUrl})")
    void insert(User user);


    @Select("select * from user where token = #{token}")
    User findByToken(String token);
}
