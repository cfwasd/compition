package com.example.mes.dao.mapper;

import com.example.mes.dao.entry.ProductModelChangelog;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ProductModelChangelogMapper {
    @Select("SELECT * FROM productmodelchangelog")
    List<ProductModelChangelog> selectAll();
}
