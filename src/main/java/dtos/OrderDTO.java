package dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import models.OrderDetail;
import models.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderDTO {
    @JsonProperty("user_id")
    private User user;
    @JsonProperty("order_detail_id")
    private List<OrderDetail> OrderDetails = new ArrayList<>();
    @JsonProperty("date")
    private Date date;
    @JsonProperty("estimateDate")
    private Date estimateDate;
    @JsonProperty("address")
    private String address;
    @JsonProperty("status")
    private String status;
    @JsonProperty("note")
    private String note;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<OrderDetail> getOrderDetails() {
        return OrderDetails;
    }

    public void setOrderDetails(List<OrderDetail> orderDetails) {
        OrderDetails = orderDetails;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getEstimateDate() {
        return estimateDate;
    }

    public void setEstimateDate(Date estimateDate) {
        this.estimateDate = estimateDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
