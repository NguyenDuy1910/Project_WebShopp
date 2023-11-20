package models;
import javax.persistence.*;
import java.util.*;

@Entity
@Table(name="reviews")
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name="review_id")
    private long id;

    @ManyToOne(cascade=CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private User user;
    @ManyToOne(cascade=CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id", referencedColumnName = "product_id")
    private Product product;
    @Column(name = "content")
    private String content;
    @Column(name = "rating")
    private Integer rating;
    @Column(name = "date")
    private Date date;
    @Column(name = "characteristic")
    private String characteristic;
}
