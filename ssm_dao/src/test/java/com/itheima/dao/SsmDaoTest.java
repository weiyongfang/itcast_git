package com.itheima.dao;

import com.itheima.pojo.Precout;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class SsmDaoTest {
    @Test
    public void test(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext
                = new ClassPathXmlApplicationContext("classpath:spring-mybatis.xml");
        PrecoutDao precoutDao = (PrecoutDao)classPathXmlApplicationContext.getBean("precoutDao");
        Precout precout= new Precout();

        //(name,price,pic,createtime,detail)
        precout.setName("商品名称");
        precout.setPrice(16666f);
         precout.setPic("wada");
        precout.setCreatetime(new Date());
        precout.setDetail("sssda");
        precoutDao.save(precout);
    }
}
