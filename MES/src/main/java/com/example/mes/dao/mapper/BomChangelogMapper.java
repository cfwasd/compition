package com.example.mes.dao.mapper;

import com.example.mes.dao.entry.BomChangelog;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BomChangelogMapper {
    @Select("select * from bomchangelog")
    List<BomChangelog> selectAll();
}
