package com.volkruss.gacha;

import com.volkruss.gacha.application.event.LogEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class LogEventPublisher {

    private final ApplicationEventPublisher applicationEventPublisher;

    public LogEventPublisher(ApplicationEventPublisher applicationEventPublisher){
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public void call(String message){
        LogEvent logEvent = new LogEvent(this, message);
        applicationEventPublisher.publishEvent(logEvent);
    }


}
