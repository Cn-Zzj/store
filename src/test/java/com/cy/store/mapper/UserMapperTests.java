package com.cy.store.mapper;

import com.cy.store.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author zzj
 * @date 2022/9/6 - 20:25
 */

@SpringBootTest
@RunWith(SpringRunner.class)
public class UserMapperTests {

    //@Autowired
    @Autowired(required = false)
    private UserMapper userMapper;

    @Test
    public void insert() {
        User user = new User();
        user.setUsername("tim");
        user.setPASSWORD("123456");
        Integer rows = userMapper.insert(user);
        System.out.println(rows);
    }

    @Test
    public void findByUsername() {
        User user = userMapper.findByUsername("ti");
        System.out.println(user);
    }
}
