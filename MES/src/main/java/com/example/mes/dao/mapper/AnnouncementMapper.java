package com.example.mes.dao.mapper;

import com.example.mes.dao.entry.Announcement;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface AnnouncementMapper {
    @Select("select * from announcement")
    List<Announcement> selectAll();
    @Select("select * from announcement where announcementID = #{announcementID}")
    Announcement selectById(int announcementID);

    @Insert("insert into announcement(Title,Content,Publisher,PublishTime,AttachmentName,AttachmentURL) " +
            "values(#{title},#{content},#{publisher},#{publishTime},#{attachmentName},#{attachmentURL})")
    int insert(Announcement announcement);

    @Delete("DELETE FROM announcement WHERE announcementID = #{announcementID}")
    int delete(int announcementID);

    @Update("UPDATE announcement SET Title = #{title}, Content = #{content}, Publisher = #{publisher}," +
            "PublishTime = #{publishTime}, AttachmentName = #{attachmentName},AttachmentURL = #{attachmentURL}" +
            "where announcementID = #{announcementID}")
    int update(Announcement announcement);
}
