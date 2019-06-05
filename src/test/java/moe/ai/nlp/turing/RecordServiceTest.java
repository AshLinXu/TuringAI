package moe.ai.nlp.turing;

import moe.ai.nlp.turing.model.Record;
import moe.ai.nlp.turing.model.User;
import moe.ai.nlp.turing.service.IRecordService;
import moe.ai.nlp.turing.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Timestamp;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RecordServiceTest {

    @Autowired
    IUserService userService;

    @Autowired
    IRecordService recordService;

    @Test
    public void saveRecord() {
        User user = new User("kangkang", "123", "dreamcirno.com");
        userService.register(user);
        Record record1 = new Record("kangkang", new Timestamp(System.currentTimeMillis()),
                "json", 1);
        recordService.saveRecord(record1);
    }

    @Test
    public void findRecords() {
        saveRecord();
        List<Record> kangkang = recordService.findRecordsByUsername("kangkang");
        System.out.println(kangkang);
    }

}
