package moe.ai.nlp.turing.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcController {

    @RequestMapping("/calc")
    public int getResult(int i) {
        int j;
        j = 1 / i;
        return j;
    }

}
