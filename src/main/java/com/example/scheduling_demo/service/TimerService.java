package com.example.scheduling_demo.service;

import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;


@Service
public class TimerService {

    private LocalDateTime time;

    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

    public String getCurrentTime() {
        return time.format(formatter);
    }

    public void setCurrentTime(LocalDateTime localDateTime) {
        this.time = localDateTime;
    }
}
