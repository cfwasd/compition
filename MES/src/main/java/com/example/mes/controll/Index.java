package com.example.mes.controll;

import com.example.mes.dao.entry.Announcement;
import com.example.mes.dao.mapper.AnnouncementMapper;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Index {
    @Resource
    private AnnouncementMapper service;
    @GetMapping("/index")
    public List<Announcement> index() {
        return service.selectAll();
    }
}
