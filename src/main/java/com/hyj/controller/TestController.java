package com.hyj.controller;

import com.hyj.entity.AlcRefund;
import com.hyj.entity.Book;
import com.hyj.mapper.AlcRefundMapper;
import com.hyj.mapper.BookMapperDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @version 1.0
 * @Authord yujie huang  email: 190158792@qq.com
 * @Description
 * @Date Create by in 17:32 2019/3/22
 */
@RestController
public class TestController {

    @Autowired
    BookMapperDao bookMapperDao;
    @Autowired
    AlcRefundMapper alcRefundMapper;
    @GetMapping("/hello")
    public String test(){
        System.out.println("=========");
        List<AlcRefund> alcRefund = alcRefundMapper.geTppRefundsByOrder_id("11181019144925944046");
        System.out.println(alcRefund.get(0).toString());
        return "HELLO WORLD";
    }
}
