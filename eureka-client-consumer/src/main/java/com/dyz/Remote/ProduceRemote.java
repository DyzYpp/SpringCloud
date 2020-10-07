package com.dyz.Remote;

import com.dyz.pojo.Product;
import com.dyz.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author duanyuzhe
 * @since 2020/9/27
 */
@FeignClient(name = "eureka-client")
public interface ProduceRemote {

    /**
     * 远程服务调用测试接口
     */
    @GetMapping(value = "/eka/getProductById")
    String getProductById(@RequestParam Integer id);

    /**
     * 远程调用传递对象
     */
    @RequestMapping(value = "/eka/getProduct")
    Product getProduct(@RequestParam Integer id, @RequestBody User user);
}
