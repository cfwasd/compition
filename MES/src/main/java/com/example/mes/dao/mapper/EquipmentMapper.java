package com.example.mes.dao.mapper;

import com.example.mes.dao.entry.Equipment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface EquipmentMapper {
    @Select("select * from equipment")
    List<Equipment> selectAll();
}
