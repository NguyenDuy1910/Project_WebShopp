package dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import models.Role;
import java.util.*;
public class UserDTO {
    @JsonProperty("name")
    private String name;
    @JsonProperty("role_id")
    private Long roleId;
    @JsonProperty("address")
    private String password;
    @JsonProperty("phone_number")
    private String phoneNumber;
    @JsonProperty("birth_date")
    private Date birthDate;
    @JsonProperty("email")
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
