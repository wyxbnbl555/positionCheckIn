package com.example.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Activity {
    private Long id;
    private String name;
    private String announcement;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private int maxCheckins;
    private double checkinRange;
    private Users users;
}
