package com.jkfq.serviceconsumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * ${DESCRIPTION}
 *
 * @Author
 * @create 2019-01-23
 **/
@FeignClient(value = "service-producer",fallback = FeignHelloServiceHystrix.class)
public interface FeignHelloService {

    @GetMapping("hello")
    public String hello(@RequestParam(value = "name") String name);

    @GetMapping("login/login")
    public String login(@RequestParam(value = "name") String name);

}
