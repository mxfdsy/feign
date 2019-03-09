package com.cloud.feign.feign;

import com.cloud.feign.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("HELLO-SERVICE")
public interface HelloService {
    @RequestMapping(value = "/getHelloUser",method = RequestMethod.POST)
    User getHelloUser();
}
