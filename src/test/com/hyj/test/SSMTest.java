package com.hyj.test;

import com.hyj.entity.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/**
 * @version 1.0
 * @Authord yujie huang  email: 190158792@qq.com
 * @Description
 * @Date Create by in 17:12 2019/3/27
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class SSMTest {
    @Autowired
    RedisTemplate redisTemplate;
    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @Test
    public void test1(){
        ValueOperations valueOperations = redisTemplate.opsForValue();
//        valueOperations.set("first","hello world");
        System.out.println(valueOperations.get("first"));
    }
    @Test
    public void test2(){
        ValueOperations<String, String> stringStringValueOperations = stringRedisTemplate.opsForValue();
        stringStringValueOperations.set("sentinel","hello everyone");
        System.out.println(stringStringValueOperations.get("sentinel"));
        System.out.println(stringRedisTemplate.getExpire("sentinel", TimeUnit.MILLISECONDS));
        stringRedisTemplate.delete("sentinel");
    }
    @Test
    public void test3(){
        ValueOperations valueOperations = redisTemplate.opsForValue();
        HashMap<String,String> map = new HashMap<>();
        map.put("hello","world");
        valueOperations.set("second",map);
        HashMap<String,String> map2 = (HashMap)valueOperations.get("second");
        System.out.println(
                map2
        );
        System.out.println(map2.get("hello"));
        Book book = new Book();
        book.setAuthor("huangyujie");
        valueOperations.set("third",book);
        Book book2 = (Book)valueOperations.get("third");
        System.out.println(book2.getAuthor());
    }
}
