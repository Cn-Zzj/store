package com.cy.store.mapper;

import com.cy.store.entity.User;

/**
 * @author zzj
 * @date 2022/9/6 - 20:03
 */
public interface UserMapper {
    Integer insert (User user);

    User findByUsername(String username);

}
