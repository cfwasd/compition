package com.example.mes.dao.mapper;

import com.example.mes.dao.entry.Material;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MaterialMapper {
    @Select("select * from material")
    List<Material> selectAll();
}
