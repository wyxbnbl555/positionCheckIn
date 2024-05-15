package com.example.service.impl;

import com.example.mapper.ActivityMapper;
import com.example.pojo.Activity;
import com.example.service.ActivityService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActivityServiceImpl implements ActivityService {
    private ActivityMapper activityMapper;

    @Override
    public List<Activity> list() {
        return activityMapper.list();
    }

    @Override
    public void add(Activity activity) {
        activityMapper.insert(activity);
    }
}
