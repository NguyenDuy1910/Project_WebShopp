package dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import models.Product;
import models.User;

import javax.persistence.*;
import java.util.Date;

public class ReviewDTO {
    @JsonProperty("user_id")
    private User user;
    @JsonProperty("product_id")
    private Product product;
    @JsonProperty("content")
    private String content;
    @JsonProperty("rating")
    private Integer rating;
    @JsonProperty("date")
    private Date date;
    @JsonProperty("characteristic")
    private String characteristic;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCharacteristic() {
        return characteristic;
    }

    public void setCharacteristic(String characteristic) {
        this.characteristic = characteristic;
    }
}
