package moe.ai.nlp.turing.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;
import java.sql.Timestamp;

@Slf4j
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@IdClass(RecordMultiKey.class)
public class Record {

    @Id
    @Column
    private String username;

    @Id
    @Column
    private Timestamp timestamp;

    @Column(columnDefinition = "text")
    private String json;
    @Column
    private int type;

}
