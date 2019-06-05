package moe.ai.nlp.turing.model;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;

@Slf4j
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "user")
public class User {

    @Column(columnDefinition = "bigint(20) not null UNIQUE key auto_increment")
    private int userId;

    @Id
    @Column
    private String username;

    @Column
    private String password;

    @Column
    private String logoUrl;

    public User(String username, String password, String logoUrl) {
        this.username = username;
        this.password = password;
        this.logoUrl = logoUrl;
    }
}