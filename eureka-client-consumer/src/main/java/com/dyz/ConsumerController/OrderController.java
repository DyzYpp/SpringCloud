package com.dyz.ConsumerController;

import com.dyz.Remote.ProduceRemote;
import com.dyz.pojo.Product;
import com.dyz.pojo.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;

/**
 * OrderController
 *
 * @author duanyuzhe
 * @since 2020/9/27
 */
@RestController
@RequestMapping(value = "/order")
public class OrderController {

    @Resource
    private ProduceRemote produceRemote;

    /**
     * 远程服务调用测试接口
     */
    @GetMapping
    public String getOrder(){
        return produceRemote.getProductById(10086);
    }

    /**
     * 远程调用传递对象
     */
    @RequestMapping(value = "/getProduct")
    public Product getProduct(){
        Product product = produceRemote.getProduct(10010, new User(123456, "张三"));
        return product;
    }
}
