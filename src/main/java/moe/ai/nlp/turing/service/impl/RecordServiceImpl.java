package moe.ai.nlp.turing.service.impl;

import moe.ai.nlp.turing.model.Record;
import moe.ai.nlp.turing.repository.RecordRepository;
import moe.ai.nlp.turing.service.IRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecordServiceImpl implements IRecordService {

    @Autowired
    RecordRepository recordRepository;

    @Override
    public Record saveRecord(Record record) {
        return recordRepository.saveAndFlush(record);
    }

    @Override
    public List<Record> findRecordsByUsername(String username) {
        return recordRepository.findRecordsByUsername(username);
    }
}
