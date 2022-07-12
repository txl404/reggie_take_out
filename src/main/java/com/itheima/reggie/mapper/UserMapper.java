package com.itheima.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.reggie.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author superli
 * @Description
 * @Date 2022/5/4 22:17
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
