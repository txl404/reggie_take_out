package com.itheima.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Set;

@SpringBootTest
@RunWith(SpringRunner.class)
public class SpringDateRedisTest {

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void testString(){
        redisTemplate.opsForValue().set("city2","beijing");
    }

    @Test
    public void testHash(){
        HashOperations hashOperations = redisTemplate.opsForHash();
        hashOperations.put("001","name","xiaoming");
        hashOperations.put("001","age","20");
        hashOperations.put("001","address","beijing");

        String age = (String) hashOperations.get("001", "age");
        System.out.println(age);

        Set keys = hashOperations.keys("001");
        for (Object key : keys){
            System.out.println(key);
        }

        List values = hashOperations.values("001");
        for (Object value : values) {
            System.out.println(value);
        }
    }


}
