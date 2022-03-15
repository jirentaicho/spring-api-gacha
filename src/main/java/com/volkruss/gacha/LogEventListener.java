package com.volkruss.gacha;

import com.volkruss.gacha.application.event.LogEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class LogEventListener implements ApplicationListener<LogEvent> {

    @Override
    public void onApplicationEvent(LogEvent event) {
        // LogEventに設定されるmessageを取得する
        String message = event.getMessage();
        // TODO ログに出力する
        System.out.println(message);
    }
}
