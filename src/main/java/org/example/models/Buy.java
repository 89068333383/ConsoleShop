package org.example.models;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

@Entity
@Table(name = "buy")
public class Buy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ColumnDefault("nextval('buy_id_seq'::regclass)")
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "buy_date", length = Integer.MAX_VALUE)
    private String buyDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "buy_user_id")
    private User buyUser;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "buy_product_id")
    private Product buyProduct;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBuyDate() {
        return buyDate;
    }

    public void setBuyDate(String buyDate) {
        this.buyDate = buyDate;
    }

    public User getBuyUser() {
        return buyUser;
    }

    public void setBuyUser(User buyUser) {
        this.buyUser = buyUser;
    }

    public Product getBuyProduct() {
        return buyProduct;
    }

    public void setBuyProduct(Product buyProduct) {
        this.buyProduct = buyProduct;
    }

}