package com.itheima.service.impl;

import com.itheima.dao.PrecoutDao;
import com.itheima.pojo.Precout;
import com.itheima.service.PrecoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("precoutService")
public class PrecoutServiceimpl implements PrecoutService {
@Autowired
    PrecoutDao precoutDao;
    public List<Precout> findAll() {
        List<Precout> precouts = precoutDao.findAll();
        return precouts;
    }
}
