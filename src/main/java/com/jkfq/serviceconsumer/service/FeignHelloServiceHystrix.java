package com.jkfq.serviceconsumer.service;

import org.springframework.stereotype.Component;

/**
 * ${DESCRIPTION}
 *
 * @Author
 * @create 2019-01-24
 **/
@Component
public class FeignHelloServiceHystrix implements FeignHelloService{

    @Override
    public String hello(String name) {
        return "sorry "+name+"，service has fail!";
    }

    @Override
    public String login(String name) {
        return "sorry login"+name+"，service has fail!";
    }
}
