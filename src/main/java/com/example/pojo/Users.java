package com.example.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Users {
    private int id;
    private String wechatId;
    private String avatar;
    private String wechatName;
    private String studentName;
    private String studentId;
}
