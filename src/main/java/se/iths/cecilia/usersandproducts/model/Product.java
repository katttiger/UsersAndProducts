package se.iths.cecilia.usersandproducts.model;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Product {
    private BigInteger id;
    private String title;
    private BigDecimal price;
    private String name;

    public Product() {
    }

    public Product(String title, BigDecimal price, String name) {
        this.title = title;
        this.price = price;
        this.name = name;
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
