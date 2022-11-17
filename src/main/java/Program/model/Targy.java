package Program.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Targy {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private int kredit;
    private String nev;
    private String leiras;

    public Targy() {
    }
    public Targy(String nev, int kredit, String leiras) {
        this.nev = nev;
        this.kredit = kredit;
        this.leiras = leiras;
    }

    public Long getId() {
        return id;
    }


    public int getKredit() {
        return kredit;
    }
    public void setKredit(int kredit) {
        this.kredit = kredit;
    }

    public String getNev() {
        return nev;
    }
    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getLeiras() {
        return leiras;
    }

    public void setLeiras(String leiras) {
        this.leiras = leiras;
    }

}
