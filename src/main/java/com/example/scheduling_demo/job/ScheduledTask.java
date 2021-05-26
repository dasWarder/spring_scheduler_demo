package com.example.scheduling_demo.job;


import com.example.scheduling_demo.service.ConsoleService;
import com.example.scheduling_demo.service.TimerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Slf4j
@Component
public class ScheduledTask {

    private TimerService timerService;
    private ConsoleService consoleService;

    public ScheduledTask(TimerService timerService, ConsoleService consoleService) {
        this.timerService = timerService;
        this.consoleService = consoleService;
    }

    @Scheduled(fixedRate = 1000)
    public void reportCurrentTime() {
        timerService.setCurrentTime(LocalDateTime.now());
        consoleService.writeTimeToConsole();
    }
}
