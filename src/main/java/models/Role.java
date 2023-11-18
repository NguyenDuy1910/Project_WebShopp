package models;

import javax.persistence.*;

@Entity
@Table(name="roles")
public class Role {
    public static String ADMIN = "ADMIN";
    public static String USER = "USER";
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="role_id")
    private Long id;

    @Column(name="name", nullable = false)
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
