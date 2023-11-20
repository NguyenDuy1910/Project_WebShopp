package dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BrandDTO {
    @JsonProperty("name")
    private String name;
    @JsonProperty("country")
    private String country;
}
