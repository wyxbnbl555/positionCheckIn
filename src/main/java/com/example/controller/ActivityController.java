package com.example.controller;

import com.example.pojo.Result;
import com.example.pojo.Activity;
import com.example.service.ActivityService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@Slf4j
@RestController
public class ActivityController {
    @Autowired
    private ActivityService activityService;

    @RequestMapping(value = "/create")
    public Result add(@RequestBody Activity activity){
        log.info("发布签到: {}", activity);
        activityService.add(activity);
        return Result.success();
    }
}
