package models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name="order_id")
    private Long id;

    @Column (name="date")
    private Date date;
    @Column(name="estimateDate")
    private Date estimateDate;
    @Column(name="address", nullable = false)
    private String address;
    @Column(name = "status", columnDefinition = "Chưa giao")
    private String status;
    @Column(name="note")
    private String note;

}
