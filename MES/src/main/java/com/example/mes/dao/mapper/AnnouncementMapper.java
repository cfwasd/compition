package com.example.mes.dao.mapper;

import com.example.mes.dao.entry.Announcement;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface AnnouncementMapper {
    @Select("select * from announcement")
    List<Announcement> selectAll();
}
