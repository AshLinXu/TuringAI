package moe.ai.nlp.turing.web.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice(basePackages = "moe.ai.nlp.turing.web.controller")
public class GlobalExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public Map<String, Object> errorResult() {
        Map<String, Object> errorResultMap = new HashMap<>();
        errorResultMap.put("errorCode", 500);
        errorResultMap.put("errorMsg", "系统错误！");
        return errorResultMap;
    }

}
