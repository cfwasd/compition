package com.example.mes.controll;

import com.example.mes.dao.entry.Announcement;
import com.example.mes.dao.mapper.AnnouncementMapper;
import jakarta.annotation.Resource;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class Index {
    @Resource
    private AnnouncementMapper service;
    @GetMapping("/index")
    public List<Announcement> index() {
        return service.selectAll();
    }
    @PostMapping("/insert")
    public int insert(@RequestBody Announcement announcement) {
        System.out.println(announcement.toString());
        return service.insert(announcement);
    }
    @GetMapping("/select")
    public Announcement select(@Param("announcementID") int announcementID) {
        return service.selectById(announcementID);
    }
    @GetMapping("/delete")
    public int update(@Param("announcementID") int announcementID){
        return service.delete(announcementID);
    }
    @PostMapping("/update")
    public int update(@RequestBody Announcement announcement){
        System.out.println(announcement.toString());
        return service.update(announcement);
    }
}
