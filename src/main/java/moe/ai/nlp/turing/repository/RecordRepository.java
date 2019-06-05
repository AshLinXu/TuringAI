package moe.ai.nlp.turing.repository;

import moe.ai.nlp.turing.model.Record;
import moe.ai.nlp.turing.model.RecordMultiKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecordRepository extends JpaRepository<Record, RecordMultiKey> {
    public List<Record> findRecordsByUsername(String username);
}
