package moe.ai.nlp.turing.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// @RestController 表示修饰该 Controller 方法的所有返回 JSON 格式，可以直接编写 Restful 接口
public class IndexController {

    @RequestMapping("/index")
    public String index() {
        return "图灵机器人主页";
    }

}
