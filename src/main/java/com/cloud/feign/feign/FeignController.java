package com.cloud.feign.feign;

import com.cloud.feign.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {
    @Autowired
    private HelloService helloService ;

    @RequestMapping("/getFeignUser")
    public User getFeignUser() {
        User user = new User();
        user.setName("我是feign的user");
        user.setAge(18);
        return user;
    }

    @RequestMapping("/getHelloUser")
    public User getHelloUser() {
        User helloUser = helloService.getHelloUser();
        return helloUser;
    }

}
