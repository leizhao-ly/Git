package com.lz.dao;

import com.lz.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

/**
 * @author LY
 */
@Repository
public interface UserDao {

    /**
     * 用来新增一条语句
     * @param user
     */
    @Insert("insert into user values(null,#{name},#{password})")
    void insertOne(User user);
}
