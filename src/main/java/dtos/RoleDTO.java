package dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RoleDTO {
    @JsonProperty("name")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
