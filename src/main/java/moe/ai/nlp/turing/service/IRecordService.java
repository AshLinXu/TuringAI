package moe.ai.nlp.turing.service;

import moe.ai.nlp.turing.model.Record;

import java.util.List;

public interface IRecordService {
    /**
     * 保存聊天记录
     * @param record
     * @return
     */
    public Record saveRecord(Record record);

    /**
     * 通过用户名查找所有聊天记录
     * @param username
     * @return
     */
    public List<Record> findRecordsByUsername(String username);
}
