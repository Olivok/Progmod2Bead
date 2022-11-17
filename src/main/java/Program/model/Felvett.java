package Program.model;

import javax.persistence.*;

@Entity
public class Felvett {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "diak_id")
    private Diak diak;
    @ManyToOne
    @JoinColumn(name = "targy_id")
    private Targy targy;

    private Boolean teljesitett;

    public Felvett(Diak diak, Targy targy) {
        this.diak = diak;
        this.targy = targy;
        this.teljesitett = false;
    }

    public Felvett() {
    }

    public Diak getDiak() {
        return diak;
    }

    public void setDiak(Diak diak) {
        this.diak = diak;
    }

    public Targy getTargy() {
        return targy;
    }

    public void setTargy(Targy targy) {
        this.targy = targy;
    }

    public Long getId() {
        return id;
    }

}
