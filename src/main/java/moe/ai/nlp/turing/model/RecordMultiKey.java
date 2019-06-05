package moe.ai.nlp.turing.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Timestamp;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class RecordMultiKey implements Serializable {
    @Id
    @Column
    private String username;
    @Id
    @Column
    private Timestamp timestamp;
}