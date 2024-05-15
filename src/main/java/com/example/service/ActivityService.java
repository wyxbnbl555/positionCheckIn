package com.example.service;

import com.example.pojo.Activity;

import java.util.List;


public interface ActivityService {
    List<Activity> list();
    void add(Activity activity);
}
