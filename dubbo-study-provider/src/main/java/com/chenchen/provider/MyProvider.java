package com.chenchen.provider;

import dubbo.domain.Dog;
import dubbo.inf.DemoService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Component
public class MyProvider implements DemoService {
    /**
     * 测试提供者
     * @param dog
     * @return
     */
    public Dog getMyDog(Dog dog) {
        dog.setSex("男一号");
        dog.setBirthday(new Date());
        dog.setAge(24);
        return dog;
    }

}
