package moe.ai.nlp.turing.service.impl;

import moe.ai.nlp.turing.model.Record;
import moe.ai.nlp.turing.model.User;
import moe.ai.nlp.turing.repository.UserRepository;
import moe.ai.nlp.turing.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements IUserService {

    @Autowired
    public UserRepository userRepository;

    @Override
    public User register(User user) {
        System.out.println("123");
        return userRepository.saveAndFlush(user);
    }
}
