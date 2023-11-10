package com.example.mes.dao.mapper;

import com.example.mes.dao.entry.EquipmentChangelog;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface EquipmentChangelogMapper {
    @Select("select * from equipmentchangelog")
    List<EquipmentChangelog> selectAll();
}
