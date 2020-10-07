package com.dyz.controller;

import com.dyz.pojo.Product;
import com.dyz.pojo.User;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

/**
 * HelloController
 *
 * @author duanyuzhe
 * @since 2020/9/27
 */
@RestController
@RequestMapping(value = "/eka")
public class HelloController {

    /**
     * 远程服务调用测试接口
     */
    @GetMapping(value = "/getProductById")
    public String hello(Integer id) {
        return "这是你的商品id为 " + id + "，规格10x100 价格 100元";
    }

    /**
     * 远程调用传递对象
     */
    @RequestMapping(value = "/getProduct")
    public Product getProduct(Integer id, @RequestBody User user) {
        System.out.println("服务提供者接受到的条件 productId：" + id);
        System.out.println("服务提供者接受到的条件 user：" + user);
        Product product = new Product(id, "护手霜", new BigDecimal("200.00"));
        return product;
    }


}
