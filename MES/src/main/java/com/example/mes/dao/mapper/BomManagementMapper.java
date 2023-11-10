package com.example.mes.dao.mapper;

import com.example.mes.dao.entry.BomManagement;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BomManagementMapper {
    @Select("select * from bommanagement")
    public List<BomManagement> selectAll();
}
