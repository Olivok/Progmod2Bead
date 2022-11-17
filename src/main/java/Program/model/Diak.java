package Program.model;

import javax.persistence.*;
import java.util.Date;
import java.util.HashMap;

@Entity
public class Diak {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;
    private Date birthDay;
    private String oktAzon;

    @ManyToOne
    @JoinColumn(name = "szak_id")
    private Szak szak;

    public Diak(String nev, Szak szak) {
        this.name = nev;
        this.szak = szak;
    }

    public Diak() {

    }

    public Szak getSzak() {
        return szak;
    }

    public void setSzak(Szak szak) {
        this.szak = szak;
    }


    public Long getId() {
        return id;
    }

}
