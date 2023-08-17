package com.technics.shop.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@ToString
@Table(name = "showcases")
public class Showcase {

    @Id
    @SequenceGenerator(name = "showcases_seq", sequenceName = "showcases_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "showcases_seq")
    private UUID id;

    @NotNull
    @Size(min = 5, max = 25,message = "Name should be within 5 and 25 letters!")
    private String name;

    @NotNull
    @Size(min = 5, max = 25,message = "Address should be within 5 and 25 letters!")
    private String address;

    @NotNull
    @Size(min = 5, max = 25,message = "Type should be within 5 and 25 letters!")
    private String type;

    @PastOrPresent(message = "Creation date should be correct!")
    private Date creationDate;

    @FutureOrPresent
    private Date lastUpdatedDate;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "items_id")
    private List <Items> itemsList;

    public Showcase(String name, String address, String type, Date creationDate, Date lastUpdatedDate) {
        this.name = name;
        this.address = address;
        this.type = type;
        this.creationDate = creationDate;
        this.lastUpdatedDate = lastUpdatedDate;
    }
}
