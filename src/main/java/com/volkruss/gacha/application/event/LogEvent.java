package com.volkruss.gacha.application.event;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class LogEvent extends ApplicationEvent {

    private final String message;

    public LogEvent(Object source, String message) {
        super(source);
        this.message = message;
    }
}
