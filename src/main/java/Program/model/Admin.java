package Program.model;

import javax.persistence.*;
import javax.swing.*;
import java.util.Date;
import java.util.HashMap;

@Entity
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String userName;
    private String email;
    private String passWord;

    public Long getId() {
        return id;
    }

}
