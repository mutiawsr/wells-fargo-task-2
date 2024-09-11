package com.wellsfargo.counselor.entity;


import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioId;

    @ManyToOne
    private Client client;

    @Column(nullable = false)
    private LocalDateTime creationDate;

    protected Portfolio() {

    }

    public Portfolio(Client client, LocalDateTime creationDate) {
        this.client = client;
        this.creationDate = creationDate;
    }

    public long getPortfolioId() { return portfolioId; }

    public Client getClient() { return client; }

    public void setClient(Client client) { this.client = client; }

    public LocalDateTime getCreationDate() { return creationDate; }

    public void setCreationDate(LocalDateTime creationDate) { this.creationDate = creationDate; }
}
