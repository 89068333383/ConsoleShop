package org.example.models;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "\"user\"")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ColumnDefault("nextval('user_id_seq'::regclass)")
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "user_name", length = Integer.MAX_VALUE)
    private String userName;

    @Column(name = "user_email", length = Integer.MAX_VALUE)
    private String userEmail;

    @Column(name = "user_addres_delivery", length = Integer.MAX_VALUE)
    private String userAddresDelivery;

    @Column(name = "user_payment", length = Integer.MAX_VALUE)
    private String userPayment;

    @OneToMany(mappedBy = "buyUser")
    private Set<Buy> buys = new LinkedHashSet<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserAddresDelivery() {
        return userAddresDelivery;
    }

    public void setUserAddresDelivery(String userAddresDelivery) {
        this.userAddresDelivery = userAddresDelivery;
    }

    public String getUserPayment() {
        return userPayment;
    }

    public void setUserPayment(String userPayment) {
        this.userPayment = userPayment;
    }

    public Set<Buy> getBuys() {
        return buys;
    }

    public void setBuys(Set<Buy> buys) {
        this.buys = buys;
    }

}