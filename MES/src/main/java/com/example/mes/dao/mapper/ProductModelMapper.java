package com.example.mes.dao.mapper;

import com.example.mes.dao.entry.ProductModel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ProductModelMapper {
    @Select("select * from productmodel")
    List<ProductModel> selectAll();
}
