package com.chenchen.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import dubbo.domain.Dog;
import dubbo.inf.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/myConsumer")
public class MyConsumer {
    @Resource
    private DemoService demoService;

    @RequestMapping("/getMyDog")
    @ResponseBody
    public Dog getMyDog() {
        Dog dog = new Dog();
        dog.setName("陈琛");
        Dog myDog = demoService.getMyDog(dog);
        System.out.println(myDog);
       return myDog;
    }
}
