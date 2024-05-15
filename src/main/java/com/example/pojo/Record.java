package com.example.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Record {
    private int id;
    private Users users;
    private Activity activity;
    private LocalDateTime checkinTime;
    private String checkinLoc;
    private String additionalInfo;

}
