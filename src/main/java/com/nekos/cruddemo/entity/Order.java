package com.nekos.cruddemo.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "table_id")
    private CafeTables cafeTable;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @Column(name = "status")
    private String status;
    @Column(name = "total_price")
    private BigDecimal totalPrice;
    @Column(name = "created_at")
    private Date createdAt;
    @Column(name = "updated_at")
    private Date updatedAt;


    public Order() {
    }

    public Order(Integer id, CafeTables cafeTable, User user, String status, BigDecimal totalPrice, Date createdAt, Date updatedAt) {
        this.id = id;
        this.cafeTable = cafeTable;
        this.user = user;
        this.status = status;
        this.totalPrice = totalPrice;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public CafeTables getCafeTable() {
        return cafeTable;
    }

    public void setCafeTable(CafeTables cafeTable) {
        this.cafeTable = cafeTable;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
