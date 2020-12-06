package com.itheima;

import com.itheima.pojo.Precout;
import com.itheima.service.PrecoutService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class serviceTest {
    @Test
    public void test(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-service.xml");
        PrecoutService precoutService = (PrecoutService) applicationContext.getBean("precoutService");
        List<Precout> precouts = precoutService.findAll();
        for (Precout precout : precouts) {
            System.out.println(precout);
        }
    }
}
