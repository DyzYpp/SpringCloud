package com.dyz.Remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author duanyuzhe
 * @since 2020/9/27
 */
@FeignClient(name = "eureka-client")
public interface ProduceRemote {

    @GetMapping(value = "/eka/getProductById")
    String getProductById(@RequestParam Integer id);
}
