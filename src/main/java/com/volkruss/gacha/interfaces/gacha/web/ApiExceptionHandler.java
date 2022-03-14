package com.volkruss.gacha.interfaces.gacha.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice(annotations = RestController.class)
public class ApiExceptionHandler extends ResponseEntityExceptionHandler {
    // 個別のカスタムエラークラスをハンドリングする
    @ExceptionHandler(NotEnoughException.class)
    public Map<String, Object> handleNotEnoughException(
            Exception ex, WebRequest webRequest
    ){
        Map<String, Object> errorMap = new HashMap<String, Object>();
        errorMap.put("message", "ガチャ石が足りません。");
        return errorMap;
    }
}
