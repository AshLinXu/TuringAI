package moe.ai.nlp.turing;

import moe.ai.nlp.turing.model.User;
import moe.ai.nlp.turing.service.IUserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {

    @Autowired
    public IUserService userService;

    @Test
    public void register() {
        User user = new User("zxh", "123", "dreamcirno.com");
        Assert.assertNotNull(userService.register(user));
    }
}
