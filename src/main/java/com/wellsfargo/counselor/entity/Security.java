package com.wellsfargo.counselor.entity;


import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Security {

    @Id
    @GeneratedValue
    private long securityId;

    @ManyToOne
    private Portfolio portfolio;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private float purchasePrice;

    @Column(nullable = false)
    private LocalDateTime purchaseDate;

    @Column(nullable = false)
    private long quantity;

    protected Security() {

    }

    public Security(Portfolio portfolio, String name, String category, float purchasePrice, LocalDateTime purchaseDate, long quantity) {
        this.portfolio = portfolio;
        this.name = name;
        this.category = category;
        this.purchasePrice = purchasePrice;
        this.purchaseDate = purchaseDate;
        this.quantity = quantity;
    }

    public long getSecurityId() { return securityId; }

    public Portfolio getPortfolio() { return portfolio; }

    public void setPortfolio(Portfolio portfolio) { this.portfolio = portfolio; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public float getPurchasePrice() { return purchasePrice; }

    public void setPurchasePrice(float purchasePrice) { this.purchasePrice = purchasePrice; }

    public LocalDateTime getPurchaseDate() { return purchaseDate; }

    public void setPurchaseDate(LocalDateTime purchaseDate) { this.purchaseDate = purchaseDate; }

    public long getQuantity() { return quantity; }

    public void setQuantity(long quantity) { this.quantity = quantity; }
}
