package dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import models.Product;

public class StorageDTO {
    @JsonProperty("product_id")
    private Product product;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
