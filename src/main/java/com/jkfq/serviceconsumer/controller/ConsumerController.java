package com.jkfq.serviceconsumer.controller;

import com.jkfq.serviceconsumer.service.FeignHelloService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * ${DESCRIPTION}
 *
 * @Author
 * @create 2019-01-23
 **/
@Slf4j
@RestController
public class ConsumerController {

    @Resource
    private FeignHelloService feignHelloService;

    @GetMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {
        log.info("-------------访问服务--------");
        feignHelloService.login(name);
        return feignHelloService.hello(name);
    }

    @RequestMapping("/login/{name}")
    public String login(@PathVariable("name") String name) {
        log.info("-------------访问登录服务--------");
        return feignHelloService.login(name);
    }

}
