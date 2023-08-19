package com.technics.shop.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.web.bind.annotation.Mapping;

import java.util.Date;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@ToString
@Table(name = "items")
public class Item {

    @Id
    @SequenceGenerator(name = "items_seq", sequenceName = "items_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "items_seq")
    private UUID id;

    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private Long showcaseId;

    @NotNull
    @Size(min = 1)
    private int position;

    @NotNull
    @Size(min = 5, max = 25 , message = "Name should be within 5 and 25 letters!")
    private String name;

    @NotNull
    @Size(min = 5, max = 25,message = "Type should be within 5 and 25 letters!")
    private String type;

    @NotNull
    @Min(value = 1000, message = "Price should be more than 1000 rub!")
    private double price;
    private Date additionDate;
    private Date modificationDate;

    public Item(Long showcaseId, int position, String name, String type, double price, Date additionDate, Date modificationDate) {
        this.showcaseId = showcaseId;
        this.position = position;
        this.name = name;
        this.type = type;
        this.price = price;
        this.additionDate = additionDate;
        this.modificationDate = modificationDate;
    }
}
