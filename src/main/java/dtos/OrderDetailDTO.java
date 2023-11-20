package dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import models.Product;

public class OrderDetailDTO {
    @JsonProperty("product_id")
    private Product product;
    @JsonProperty("quantity")
    private int quantity;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
