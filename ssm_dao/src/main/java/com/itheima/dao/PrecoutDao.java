package com.itheima.dao;

import com.itheima.pojo.Precout;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PrecoutDao {
     int save(Precout precout);
     List<Precout > findAll();

}
