package com.example.sample.models;

import java.io.Serializable;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class Users implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private Double dollar_balance;
    private Boolean enabled;
    private Timestamp created_on;
    private Timestamp updated_on;

    public Users() {
        this.created_on = Timestamp.valueOf(LocalDateTime.now());
        this.updated_on = Timestamp.valueOf(LocalDateTime.now());

    }

    // public Users(Long id, String username, String password, Double dollar_balance, Boolean enabled,
    //         Timestamp created_on, Timestamp updated_on) {
    //     this.id = id;
    //     this.username = username;
    //     this.password = password;
    //     this.dollar_balance = dollar_balance;
    //     this.enabled = enabled;
    //     this.created_on = created_on;
    //     this.updated_on = updated_on;
    // }

}
