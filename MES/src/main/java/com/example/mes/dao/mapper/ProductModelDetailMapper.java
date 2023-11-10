package com.example.mes.dao.mapper;

import com.example.mes.dao.entry.ProductModelDetail;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ProductModelDetailMapper {
    @Select("select * from productmodeldetail")
    List<ProductModelDetail> selectAll();
}
