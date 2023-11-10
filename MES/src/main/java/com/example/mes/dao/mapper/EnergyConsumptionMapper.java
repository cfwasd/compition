package com.example.mes.dao.mapper;

import com.example.mes.dao.entry.EnergyConsumption;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface EnergyConsumptionMapper {
    @Select("select * from energyconsumption")
    List<EnergyConsumption> selectAll();
}
