package com.example.scheduling_demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsoleService {

    @Autowired
    private TimerService timerService;

    public void writeTimeToConsole() {
        System.out.println(timerService.getCurrentTime());
    }
}
