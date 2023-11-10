package com.example.mes.dao.mapper;

import com.example.mes.dao.entry.BomDetail;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface BomDetailMapper {
    @Select("select * from bomdetail")
    List<BomDetail> selectAll();
}
