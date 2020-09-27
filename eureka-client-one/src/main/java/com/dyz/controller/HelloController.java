package com.dyz.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloController
 *
 * @author duanyuzhe
 * @since 2020/9/27
 */
@RestController
@RequestMapping(value = "/eka")
public class HelloController {

    @GetMapping(value = "/getProductById")
    public String hello(Integer id){
        return "这是你的商品id为 "+ id + "，规格10x100 价格 100元";
    }
}
