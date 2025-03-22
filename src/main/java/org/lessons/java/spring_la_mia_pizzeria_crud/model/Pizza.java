package org.lessons.java.spring_la_mia_pizzeria_crud.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

@Entity
@Table(name = "pizzas")
public class Pizza {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank
    private String name;

    @Lob
    private String description;

    @Column(name = "image_url")
    private String imgUrl;

    @NotNull
    @Positive
    @Digits(integer = 5, fraction = 2)
    private BigDecimal price;

    // # Costruttori
    public Pizza() {
    }

    public Pizza(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    public Pizza(String name, String imgUrl, BigDecimal price) {
        this.name = name;
        this.imgUrl = imgUrl;
        this.price = price;
    }

    public Pizza(String name, String description, String imgUrl, BigDecimal price) {
        this.name = name;
        this.description = description;
        this.imgUrl = imgUrl;
        this.price = price;
    }

    // # Getter e Setter
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImgUrl() {
        return this.imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public BigDecimal getPrice() {
        return this.price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Pizza:  " + this.name + " " + this.price;
    }

}
