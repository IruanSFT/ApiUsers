package com.example.sample.models;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "user_orders")
public class UserOrders implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private Users users;
    private Long id_stock;
    private String stock_symbol;
    private String stock_name;
    private Long volume;
    private Number price;
    private Long type;
    private Long status;
    private Timestamp created_on;
    private Timestamp updated_on;

    public UserOrders(Long id, Users users, Long id_stock, String stock_symbol, String stock_name, Long volume,
                      Number price, Long type, Long status, Timestamp created_on, Timestamp updated_on) {
        this.id = id;
        this.users = users;
        this.id_stock = id_stock;
        this.stock_symbol = stock_symbol;
        this.stock_name = stock_name;
        this.volume = volume;
        this.price = price;
        this.type = type;
        this.status = status;
        this.created_on = created_on;
        this.updated_on = updated_on;
    }

    public UserOrders() {

    }
}

