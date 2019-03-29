package com.hyj.mapper;

import com.hyj.entity.Book;
import org.apache.ibatis.annotations.Param;

/**
 * @version 1.0
 * @Authord yujie huang  email: 190158792@qq.com
 * @Description
 * @Date Create by in 17:22 2019/3/25
 */
public interface BookMapperDao {
    Book selectBookById(@Param("id") String id);
}
