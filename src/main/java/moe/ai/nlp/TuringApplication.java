package moe.ai.nlp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 扫描包的范围在同级包、子包下
@SpringBootApplication
public class TuringApplication {

    public static void main(String[] args) {
        SpringApplication.run(TuringApplication.class, args);
    }

}
