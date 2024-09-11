package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Security {

    @Id
    @GeneratedValue
    private long securityId;

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

    public Security(String name, String category, float purchasePrice, LocalDateTime purchaseDate, long quantity) {
        this.name = name;
        this.category = category;
        this.purchasePrice = purchasePrice;
        this.purchaseDate = purchaseDate;
        this.quantity = quantity;
    }

    public long getSecurityId() { return securityId; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public float getPurchasePrice() { return purchasePrice; }

    public void setPurchasePrice(float purchasePrice) { this.purchasePrice = purchasePrice; }

    public LocalDateTime getPurchaseDate() { return purchaseDate; }

    public void setPurchaseDate(LocalDateTime purchaseDate) { this.purchaseDate = purchaseDate; }

    public long getQuantity() { return quantity; }

    public void setQuantity(long quantity) { this.quantity = quantity; }
}
