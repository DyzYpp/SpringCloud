package com.dyz.ConsumerController;

import com.dyz.Remote.ProduceRemote;
import org.springframework.beans.factory.annotation.Autowired;
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

    @GetMapping
    public String getOrder(){
        return produceRemote.getProductById(10086);
    }
}
