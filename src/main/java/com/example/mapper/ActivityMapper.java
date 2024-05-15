package com.example.mapper;

import com.example.pojo.Activity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ActivityMapper {
    @Select("select * from table")
    List<Activity> list();

    @Insert("insert into checkin_activity(name,announcement,start_time,end_time,max_checkins,checkin_range) values(#{name},#{announcement},#{startTime},#{endTime},#{checkinRange},#{checkinRange})")
    void insert(Activity activity);
}
